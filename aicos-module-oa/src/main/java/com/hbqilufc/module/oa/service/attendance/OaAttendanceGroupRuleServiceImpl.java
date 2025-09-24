package com.hbqilufc.module.oa.service.attendance;

import cn.hutool.core.bean.BeanUtil;
import com.hbqilufc.module.oa.controller.admin.attendance.vo.OaAttendanceGroupRuleVO;
import com.hbqilufc.module.oa.dal.dataobject.attendance.OaAttendanceGroupRulePO;
import com.hbqilufc.module.oa.dal.mysql.attendance.OaAttendanceGroupRuleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
/**
 * 考勤组规则表;(oa_attendance_group_rule)表服务接口实现类
 * @author : http://www.yonsum.com
 * @date : 2025-9-24
 */
@Service
@Slf4j
public class OaAttendanceGroupRuleServiceImpl implements OaAttendanceGroupRuleService{
    @Autowired
    private OaAttendanceGroupRuleMapper oaAttendanceGroupRuleMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public OaAttendanceGroupRuleVO queryById(long id) {
        OaAttendanceGroupRulePO poRow = oaAttendanceGroupRuleMapper.selectById(id);
        OaAttendanceGroupRuleVO voRow = BeanUtil.copyProperties(poRow,OaAttendanceGroupRuleVO.class);
        BeanUtil.copyProperties(poRow,voRow,true);
        return voRow;
    }

    /**
     * 分页查询
     *
     * @param oaAttendanceGroupRule 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return 分页查询结果
     */
    public Page<OaAttendanceGroupRuleVO> paginQuery(OaAttendanceGroupRuleVO oaAttendanceGroupRule, long current, long size) {
        IPage<OaAttendanceGroupRulePO> page = oaAttendanceGroupRuleMapper.selectByPage(new Page<>(current, size), new LambdaQueryWrapper<OaAttendanceGroupRulePO>());
        Page<OaAttendanceGroupRuleVO> pagin = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        pagin.setRecords(BeanUtil.copyToList(page.getRecords(), OaAttendanceGroupRuleVO.class));
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param oaAttendanceGroupRule 实例对象
     * @return 实例对象
     */
    public OaAttendanceGroupRuleVO insert(OaAttendanceGroupRuleVO oaAttendanceGroupRule){
        OaAttendanceGroupRulePO poRow = BeanUtil.copyProperties(oaAttendanceGroupRule,OaAttendanceGroupRulePO.class);
        oaAttendanceGroupRuleMapper.insert(poRow);
        OaAttendanceGroupRuleVO voRow = BeanUtil.copyProperties(oaAttendanceGroupRule,OaAttendanceGroupRuleVO.class);
        return voRow;
    }

    /**
     * 更新数据
     *
     * @param oaAttendanceGroupRule 实例对象
     * @return 实例对象
     */
    public OaAttendanceGroupRuleVO update(OaAttendanceGroupRuleVO oaAttendanceGroupRule){
        OaAttendanceGroupRulePO poRow = BeanUtil.copyProperties(oaAttendanceGroupRule,OaAttendanceGroupRulePO.class);
        oaAttendanceGroupRuleMapper.updateById(poRow);
        OaAttendanceGroupRuleVO voRow = BeanUtil.copyProperties(oaAttendanceGroupRule,OaAttendanceGroupRuleVO.class);
        return voRow;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public Integer deleteById(long id){
        int total = oaAttendanceGroupRuleMapper.deleteById(id);
        return total ;
    }
}