package com.hbqilufc.module.oa.service.attendance;

import cn.hutool.core.bean.BeanUtil;
import com.hbqilufc.module.oa.controller.admin.attendance.vo.OaApplyRecordVO;
import com.hbqilufc.module.oa.dal.dataobject.attendance.OaApplyRecordPO;
import com.hbqilufc.module.oa.dal.mysql.attendance.OaApplyRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
/**
 * 假勤申请记录表;(oa_apply_record)表服务接口实现类
 * @author : http://www.yonsum.com
 * @date : 2025-9-24
 */
@Service
@Slf4j
public class OaApplyRecordServiceImpl implements OaApplyRecordService{
    @Autowired
    private OaApplyRecordMapper oaApplyRecordMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public OaApplyRecordVO queryById(long id) {
        OaApplyRecordPO poRow = oaApplyRecordMapper.selectById(id);
        OaApplyRecordVO voRow = BeanUtil.copyProperties(poRow,OaApplyRecordVO.class);
        BeanUtil.copyProperties(poRow,voRow,true);
        return voRow;
    }

    /**
     * 分页查询
     *
     * @param oaApplyRecord 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return 分页查询结果
     */
    public Page<OaApplyRecordVO> paginQuery(OaApplyRecordVO oaApplyRecord, long current, long size) {
        IPage<OaApplyRecordPO> page = oaApplyRecordMapper.selectByPage(new Page<>(current, size), new LambdaQueryWrapper<OaApplyRecordPO>());
        Page<OaApplyRecordVO> pagin = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        pagin.setRecords(BeanUtil.copyToList(page.getRecords(), OaApplyRecordVO.class));
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param oaApplyRecord 实例对象
     * @return 实例对象
     */
    public OaApplyRecordVO insert(OaApplyRecordVO oaApplyRecord){
        OaApplyRecordPO poRow = BeanUtil.copyProperties(oaApplyRecord,OaApplyRecordPO.class);
        oaApplyRecordMapper.insert(poRow);
        OaApplyRecordVO voRow = BeanUtil.copyProperties(oaApplyRecord,OaApplyRecordVO.class);
        return voRow;
    }

    /**
     * 更新数据
     *
     * @param oaApplyRecord 实例对象
     * @return 实例对象
     */
    public OaApplyRecordVO update(OaApplyRecordVO oaApplyRecord){
        OaApplyRecordPO poRow = BeanUtil.copyProperties(oaApplyRecord,OaApplyRecordPO.class);
        oaApplyRecordMapper.updateById(poRow);
        OaApplyRecordVO voRow = BeanUtil.copyProperties(oaApplyRecord,OaApplyRecordVO.class);
        return voRow;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public Integer deleteById(long id){
        int total = oaApplyRecordMapper.deleteById(id);
        return total ;
    }
}