package com.hbqilufc.module.oa.service.attendance;

import cn.hutool.core.bean.BeanUtil;
import com.hbqilufc.module.oa.controller.admin.attendance.vo.OaAttendanceGroupVO;
import com.hbqilufc.module.oa.dal.dataobject.attendance.OaAttendanceGroupPO;
import com.hbqilufc.module.oa.dal.mysql.attendance.OaAttendanceGroupMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
/**
 * 考勤组表;(oa_attendance_group)表服务接口实现类
 * @author : http://www.yonsum.com
 * @date : 2025-9-24
 */
@Service
@Slf4j
public class OaAttendanceGroupServiceImpl implements OaAttendanceGroupService{
    @Autowired
    private OaAttendanceGroupMapper oaAttendanceGroupMapper;

    /**
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    public OaAttendanceGroupVO queryById(long id) {
        OaAttendanceGroupPO poRow = oaAttendanceGroupMapper.selectById(id);
        OaAttendanceGroupVO voRow = BeanUtil.copyProperties(poRow,OaAttendanceGroupVO.class);
        BeanUtil.copyProperties(poRow,voRow,true);
        return voRow;
    }

    /**
     * 分页查询
     *
     * @param oaAttendanceGroup 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return 分页查询结果
     */
    public Page<OaAttendanceGroupVO> paginQuery(OaAttendanceGroupVO oaAttendanceGroup, long current, long size) {
        IPage<OaAttendanceGroupPO> page = oaAttendanceGroupMapper.selectByPage(new Page<>(current, size), new LambdaQueryWrapper<OaAttendanceGroupPO>());
        Page<OaAttendanceGroupVO> pagin = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        pagin.setRecords(BeanUtil.copyToList(page.getRecords(), OaAttendanceGroupVO.class));
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param oaAttendanceGroup 实例对象
     * @return 实例对象
     */
    public OaAttendanceGroupVO insert(OaAttendanceGroupVO oaAttendanceGroup){
        OaAttendanceGroupPO poRow = BeanUtil.copyProperties(oaAttendanceGroup,OaAttendanceGroupPO.class);
        oaAttendanceGroupMapper.insert(poRow);
        OaAttendanceGroupVO voRow = BeanUtil.copyProperties(oaAttendanceGroup,OaAttendanceGroupVO.class);
        return voRow;
    }

    /**
     * 更新数据
     *
     * @param oaAttendanceGroup 实例对象
     * @return 实例对象
     */
    public OaAttendanceGroupVO update(OaAttendanceGroupVO oaAttendanceGroup){
        OaAttendanceGroupPO poRow = BeanUtil.copyProperties(oaAttendanceGroup,OaAttendanceGroupPO.class);
        oaAttendanceGroupMapper.updateById(poRow);
        OaAttendanceGroupVO voRow = BeanUtil.copyProperties(oaAttendanceGroup,OaAttendanceGroupVO.class);
        return voRow;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public Integer deleteById(long id){
        int total = oaAttendanceGroupMapper.deleteById(id);
        return total ;
    }
}