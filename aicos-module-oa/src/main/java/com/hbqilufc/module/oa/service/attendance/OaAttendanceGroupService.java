package com.hbqilufc.module.oa.service.attendance;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hbqilufc.module.oa.controller.admin.attendance.vo.OaAttendanceGroupVO;

/**
 * 考勤组表;(oa_attendance_group)表服务接口
 * @author : http://www.yonsum.com
 * @date : 2025-9-24
 */
public interface OaAttendanceGroupService{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OaAttendanceGroupVO queryById(long id);

    /**
     * 分页查询
     *
     * @param oaAttendanceGroup 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<OaAttendanceGroupVO> paginQuery(OaAttendanceGroupVO oaAttendanceGroup, long current, long size);
    /**
     * 新增数据
     *
     * @param oaAttendanceGroup 实例对象
     * @return 实例对象
     */
    OaAttendanceGroupVO insert(OaAttendanceGroupVO oaAttendanceGroup);
    /**
     * 更新数据
     *
     * @param oaAttendanceGroup 实例对象
     * @return 实例对象
     */
    OaAttendanceGroupVO update(OaAttendanceGroupVO oaAttendanceGroup);
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    Integer deleteById(long id);
}