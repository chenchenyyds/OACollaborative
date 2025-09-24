package com.hbqilufc.module.oa.service.attendance;

import cn.hutool.core.bean.BeanUtil;
import com.hbqilufc.module.oa.controller.admin.attendance.vo.OaAttendanceGroupEmployeeVO;
import com.hbqilufc.module.oa.dal.dataobject.attendance.OaAttendanceGroupEmployeePO;
import com.hbqilufc.module.oa.dal.mysql.attendance.OaAttendanceGroupEmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
/**
 * 考勤组所属员工表;(oa_attendance_group_employee)表服务接口实现类
 * @author : http://www.yonsum.com
 * @date : 2025-9-24
 */
@Service
@Slf4j
public class OaAttendanceGroupEmployeeServiceImpl implements OaAttendanceGroupEmployeeService{
    @Autowired
    private OaAttendanceGroupEmployeeMapper oaAttendanceGroupEmployeeMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public OaAttendanceGroupEmployeeVO queryById(long id) {
        OaAttendanceGroupEmployeePO poRow = oaAttendanceGroupEmployeeMapper.selectById(id);
        OaAttendanceGroupEmployeeVO voRow = BeanUtil.copyProperties(poRow,OaAttendanceGroupEmployeeVO.class);
        BeanUtil.copyProperties(poRow,voRow,true);
        return voRow;
    }

    /**
     * 分页查询
     *
     * @param oaAttendanceGroupEmployee 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return 分页查询结果
     */
    public Page<OaAttendanceGroupEmployeeVO> paginQuery(OaAttendanceGroupEmployeeVO oaAttendanceGroupEmployee, long current, long size) {
        IPage<OaAttendanceGroupEmployeePO> page = oaAttendanceGroupEmployeeMapper.selectByPage(new Page<>(current, size), new LambdaQueryWrapper<OaAttendanceGroupEmployeePO>());
        Page<OaAttendanceGroupEmployeeVO> pagin = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        pagin.setRecords(BeanUtil.copyToList(page.getRecords(), OaAttendanceGroupEmployeeVO.class));
        return pagin;
    }

    /**
     * 新增数据
     *
     * @param oaAttendanceGroupEmployee 实例对象
     * @return 实例对象
     */
    public OaAttendanceGroupEmployeeVO insert(OaAttendanceGroupEmployeeVO oaAttendanceGroupEmployee){
        OaAttendanceGroupEmployeePO poRow = BeanUtil.copyProperties(oaAttendanceGroupEmployee,OaAttendanceGroupEmployeePO.class);
        oaAttendanceGroupEmployeeMapper.insert(poRow);
        OaAttendanceGroupEmployeeVO voRow = BeanUtil.copyProperties(oaAttendanceGroupEmployee,OaAttendanceGroupEmployeeVO.class);
        return voRow;
    }

    /**
     * 更新数据
     *
     * @param oaAttendanceGroupEmployee 实例对象
     * @return 实例对象
     */
    public OaAttendanceGroupEmployeeVO update(OaAttendanceGroupEmployeeVO oaAttendanceGroupEmployee){
        OaAttendanceGroupEmployeePO poRow = BeanUtil.copyProperties(oaAttendanceGroupEmployee,OaAttendanceGroupEmployeePO.class);
        oaAttendanceGroupEmployeeMapper.updateById(poRow);
        OaAttendanceGroupEmployeeVO voRow = BeanUtil.copyProperties(oaAttendanceGroupEmployee,OaAttendanceGroupEmployeeVO.class);
        return voRow;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public Integer deleteById(long id){
        int total = oaAttendanceGroupEmployeeMapper.deleteById(id);
        return total ;
    }
}