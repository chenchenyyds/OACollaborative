package com.hbqilufc.module.oa.service.attendance;

import cn.hutool.core.bean.BeanUtil;
import com.hbqilufc.module.oa.controller.admin.attendance.vo.OaAttendanceRecordVO;
import com.hbqilufc.module.oa.dal.dataobject.attendance.OaAttendanceRecordPO;
import com.hbqilufc.module.oa.dal.mysql.attendance.OaAttendanceRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
/**
 * 考勤记录表;(oa_attendance_record)表服务接口实现类
 * @author : http://www.yonsum.com
 * @date : 2025-9-24
 */
@Service
@Slf4j
public class OaAttendanceRecordServiceImpl implements OaAttendanceRecordService{
    @Autowired
    private OaAttendanceRecordMapper oaAttendanceRecordMapper;

    /**
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    public OaAttendanceRecordVO queryById(long id) {
        OaAttendanceRecordPO poRow = oaAttendanceRecordMapper.selectById(id);
        OaAttendanceRecordVO voRow = BeanUtil.copyProperties(poRow,OaAttendanceRecordVO.class);
        BeanUtil.copyProperties(poRow,voRow,true);
        return voRow;
    }

    /**
     * 分页查询
     *
     * @param oaAttendanceRecord 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return 分页查询结果
     */
    public Page<OaAttendanceRecordVO> paginQuery(OaAttendanceRecordVO oaAttendanceRecord, long current, long size) {
        IPage<OaAttendanceRecordPO> page = oaAttendanceRecordMapper.selectByPage(new Page<>(current, size), new LambdaQueryWrapper<OaAttendanceRecordPO>());
        Page<OaAttendanceRecordVO> pagin = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        pagin.setRecords(BeanUtil.copyToList(page.getRecords(), OaAttendanceRecordVO.class));
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param oaAttendanceRecord 实例对象
     * @return 实例对象
     */
    public OaAttendanceRecordVO insert(OaAttendanceRecordVO oaAttendanceRecord){
        OaAttendanceRecordPO poRow = BeanUtil.copyProperties(oaAttendanceRecord,OaAttendanceRecordPO.class);
        oaAttendanceRecordMapper.insert(poRow);
        OaAttendanceRecordVO voRow = BeanUtil.copyProperties(oaAttendanceRecord,OaAttendanceRecordVO.class);
        return voRow;
    }

    /**
     * 更新数据
     *
     * @param oaAttendanceRecord 实例对象
     * @return 实例对象
     */
    public OaAttendanceRecordVO update(OaAttendanceRecordVO oaAttendanceRecord){
        OaAttendanceRecordPO poRow = BeanUtil.copyProperties(oaAttendanceRecord,OaAttendanceRecordPO.class);
        oaAttendanceRecordMapper.updateById(poRow);
        OaAttendanceRecordVO voRow = BeanUtil.copyProperties(oaAttendanceRecord,OaAttendanceRecordVO.class);
        return voRow;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public Integer deleteById(long id){
        int total = oaAttendanceRecordMapper.deleteById(id);
        return total ;
    }
}