package com.hbqilufc.module.oa.controller.admin.attendance.vo;

import com.hbqilufc.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "考勤组表")
public class OaAttendanceGroupVO extends PageParam{
    @Schema(description = "主键ID,;")
    private long id ;
    @Schema(description = "考勤组ID,;")
    private String groupId ;
    @Schema(description = "考勤组名称,;")
    private String groupName ;
    @Schema(description = "考勤组人数,;")
    private int maxMembers ;
    @Schema(description = "负责人ID,;")
    private String leaderId ;
    @Schema(description = "负责人名称,;")
    private String leaderName ;
    @Schema(description = "是否自动排休（法定节假日）：1-是，0-否,;")
    private String isAutoRestLegalHoliday ;
    @Schema(description = "补卡次数,;")
    private int makeUpCardTimes ;
    @Schema(description = "补卡时限范围,;")
    private String makeUpCardTimeLimit ;
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
