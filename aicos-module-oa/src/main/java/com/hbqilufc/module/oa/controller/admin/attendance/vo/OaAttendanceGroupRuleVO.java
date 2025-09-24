package com.hbqilufc.module.oa.controller.admin.attendance.vo;

import com.hbqilufc.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "考勤组规则表")
public class OaAttendanceGroupRuleVO extends PageParam{
    @Schema(description = "主键ID,;")
    private long id ;
    @Schema(description = "考勤组ID,;")
    private String groupId ;
    @Schema(description = "考勤组时间规则-日期,;")
    private String ruleDate ;
    @Schema(description = "考勤组时间规则-开始时间,;")
    private Date ruleStartTime ;
    @Schema(description = "考勤组时间规则-结束时间,;")
    private Date ruleEndTime ;
    @Schema(description = "状态（1-有效，0-无效）,;")
    private String status ;
    @Schema(description = "创建时间,;")
    private Date createTime ;
    @Schema(description = "最后更新时间,;")
    private Date updateTime ;
    @Schema(description = "创建者,;")
    private String creator ;
    @Schema(description = "更新者,;")
    private String updater ;
    @Schema(description = "是否删除,;")
    private boolean deleted ;
}
