package com.hbqilufc.module.oa.service.attendance;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hbqilufc.module.oa.controller.admin.attendance.vo.OaAttendanceGroupEmployeeVO;

/**
 * 考勤组所属员工表;(oa_attendance_group_employee)表服务接口
 * @author : http://www.yonsum.com
 * @date : 2025-9-24
 */
public interface OaAttendanceGroupEmployeeService{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OaAttendanceGroupEmployeeVO queryById(long id);

    /**
     * 分页查询
     *
     * @param oaAttendanceGroupEmployee 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<OaAttendanceGroupEmployeeVO> paginQuery(OaAttendanceGroupEmployeeVO oaAttendanceGroupEmployee, long current, long size);
    /**
     * 新增数据
     *
     * @param oaAttendanceGroupEmployee 实例对象
     * @return 实例对象
     */
    OaAttendanceGroupEmployeeVO insert(OaAttendanceGroupEmployeeVO oaAttendanceGroupEmployee);
    /**
     * 更新数据
     *
     * @param oaAttendanceGroupEmployee 实例对象
     * @return 实例对象
     */
    OaAttendanceGroupEmployeeVO update(OaAttendanceGroupEmployeeVO oaAttendanceGroupEmployee);
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    Integer deleteById(long id);
}