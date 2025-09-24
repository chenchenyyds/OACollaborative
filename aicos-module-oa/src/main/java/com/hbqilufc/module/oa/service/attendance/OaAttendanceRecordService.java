package com.hbqilufc.module.oa.service.attendance;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hbqilufc.module.oa.controller.admin.attendance.vo.OaAttendanceRecordVO;

/**
 * 考勤记录表;(oa_attendance_record)表服务接口
 * @author : http://www.yonsum.com
 * @date : 2025-9-24
 */
public interface OaAttendanceRecordService{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OaAttendanceRecordVO queryById(long id);

    /**
     * 分页查询
     *
     * @param oaAttendanceRecord 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<OaAttendanceRecordVO> paginQuery(OaAttendanceRecordVO oaAttendanceRecord, long current, long size);
    /**
     * 新增数据
     *
     * @param oaAttendanceRecord 实例对象
     * @return 实例对象
     */
    OaAttendanceRecordVO insert(OaAttendanceRecordVO oaAttendanceRecord);
    /**
     * 更新数据
     *
     * @param oaAttendanceRecord 实例对象
     * @return 实例对象
     */
    OaAttendanceRecordVO update(OaAttendanceRecordVO oaAttendanceRecord);
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    Integer deleteById(long id);
}