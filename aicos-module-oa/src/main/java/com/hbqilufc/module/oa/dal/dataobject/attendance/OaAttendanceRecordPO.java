package com.hbqilufc.module.oa.dal.dataobject.attendance;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hbqilufc.framework.mybatis.core.dataobject.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 考勤记录表 oa_attendance_record数据表的PO对象
 * @author : zzh
 * @date : 2025-9-24
 */
@TableName("oa_attendance_record")
@Data
@EqualsAndHashCode(callSuper = true)
public class OaAttendanceRecordPO extends BaseDO {
    /** 主键ID */
    @TableId
    private long id ;
    /** 员工ID */
    private String userId ;
    /** 员工名称 */
    private String userName ;
    /** 归属机构/部门代码 */
    private String deptCode ;
    /** 考勤组ID */
    private String groupId ;
    /** 考勤年月 */
    private String yearMonth ;
    /** 考勤日期 */
    private String attendanceDate ;
    /** 签到时间 */
    private Date checkinTime ;
    /** 签退时间 */
    private Date checkoutTime ;
    /** 当日工作时长（小时） */
    private String workHours ;
    /** 当日加班时长（小时） */
    private String overtimeHours ;
    /** 考勤状态("正常", "迟到", "早退", "旷工", "请假", "出差", "调休") */
    private String attendanceStatus ;
    /** 签到地点 */
    private String checkinLocation ;
    /** 签退地点 */
    private String checkoutLocation ;
}
