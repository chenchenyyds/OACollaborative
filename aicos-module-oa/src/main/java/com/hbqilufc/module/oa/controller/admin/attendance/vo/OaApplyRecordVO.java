package com.hbqilufc.module.oa.controller.admin.attendance.vo;

import com.hbqilufc.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "假勤申请记录表")
public class OaApplyRecordVO extends PageParam{
    @Schema(description = "主键ID")
    private long id ;
    @Schema(description = "工作流ID")
    private String workFlowId ;
    @Schema(description = "员工ID")
    private String userId ;
    @Schema(description = "员工名称")
    private String userName ;
    @Schema(description = "归属机构 / 部门代码")
    private String deptCode ;
    @Schema(description = "申请类型")
    private String applyType ;
    @Schema(description = "请假类型")
    private String leaveType ;
    @Schema(description = "申请开始时间")
    private Date applyStartTime ;
    @Schema(description = "申请结束时间")
    private Date applyEndTime ;
    @Schema(description = "申请原因")
    private String applyReason ;
    @Schema(description = "申请天数")
    private String applyDays ;
    @Schema(description = "申请地点")
    private String applyLocation ;
    @Schema(description = "申请描述")
    private String applyDescription ;
    @Schema(description = "附件ID")
    private String attachmentId ;
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
