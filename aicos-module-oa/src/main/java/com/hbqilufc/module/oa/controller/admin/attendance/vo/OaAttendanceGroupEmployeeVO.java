package com.hbqilufc.module.oa.controller.admin.attendance.vo;

import com.hbqilufc.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "考勤组所属员工表")
public class OaAttendanceGroupEmployeeVO extends PageParam{
    @Schema(description = "主键ID,;")
    private long id ;
    @Schema(description = "考勤组ID,;")
    private String groupId ;
    @Schema(description = "员工ID,;")
    private String userId ;
    @Schema(description = "所属年月,;")
    private String yearMonth ;
    @Schema(description = "剩余补卡次数,;")
    private int remainingMakeUpCardTimes ;
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
