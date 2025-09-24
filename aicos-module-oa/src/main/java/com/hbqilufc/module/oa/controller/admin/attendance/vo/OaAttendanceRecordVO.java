package com.hbqilufc.module.oa.controller.admin.attendance.vo;

import com.hbqilufc.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "考勤记录表")
public class OaAttendanceRecordVO extends PageParam{
    @Schema(description = "主键ID")
    private long id ;
    @Schema(description = "员工ID")
    private String userId ;
    @Schema(description = "员工名称")
    private String userName ;
    @Schema(description = "归属机构/部门代码")
    private String deptCode ;
    @Schema(description = "考勤组ID")
    private String groupId ;
    @Schema(description = "考勤年月")
    private String yearMonth ;
    @Schema(description = "考勤日期")
    private String attendanceDate ;
    @Schema(description = "签到时间")
    private Date checkinTime ;
    @Schema(description = "签退时间")
    private Date checkoutTime ;
    @Schema(description = "当日工作时长（小时）")
    private String workHours ;
    @Schema(description = "当日加班时长（小时）")
    private String overtimeHours ;
    @Schema(description = "考勤状态('正常', '迟到', '早退', '旷工', '请假', '出差', '调休')")
    private String attendanceStatus ;
    @Schema(description = "签到地点")
    private String checkinLocation ;
    @Schema(description = "签退地点")
    private String checkoutLocation ;
    @Schema(description = "创建时间")
    private Date createTime ;
    @Schema(description = "最后更新时间")
    private Date updateTime ;
    @Schema(description = "创建者")
    private String creator ;
    @Schema(description = "更新者")
    private String updater ;
    @Schema(description = "是否删除")
    private boolean deleted ;
}
