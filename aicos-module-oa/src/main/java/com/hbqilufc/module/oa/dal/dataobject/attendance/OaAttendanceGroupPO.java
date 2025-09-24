package com.hbqilufc.module.oa.dal.dataobject.attendance;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hbqilufc.framework.mybatis.core.dataobject.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 考勤组表 oa_attendance_group数据表的PO对象
 * @author : zzh
 * @date : 2025-9-24
 */
@TableName("oa_attendance_group")
@Data
@EqualsAndHashCode(callSuper = true)
public class OaAttendanceGroupPO extends BaseDO {
    /** 主键ID */
    @TableId
    private long id ;
    /** 考勤组ID */
    private String groupId ;
    /** 考勤组名称 */
    private String groupName ;
    /** 考勤组人数 */
    private int maxMembers ;
    /** 负责人ID */
    private String leaderId ;
    /** 负责人名称 */
    private String leaderName ;
    /** 是否自动排休（法定节假日）：1-是，0-否 */
    private String isAutoRestLegalHoliday ;
    /** 补卡次数 */
    private int makeUpCardTimes ;
    /** 补卡时限范围 */
    private String makeUpCardTimeLimit ;
}
