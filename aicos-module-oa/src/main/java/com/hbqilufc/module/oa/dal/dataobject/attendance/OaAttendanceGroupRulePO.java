package com.hbqilufc.module.oa.dal.dataobject.attendance;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.hbqilufc.framework.mybatis.core.dataobject.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 考勤组规则表 oa_attendance_group_rule数据表的PO对象
 * @author : zzh
 * @date : 2025-9-24
 */
@TableName("oa_attendance_group_rule")
@Data
@EqualsAndHashCode(callSuper = true)
public class OaAttendanceGroupRulePO extends BaseDO {
    /** 主键ID */
    @TableId
    private long id ;
    /** 考勤组ID */
    private String groupId ;
    /** 考勤组时间规则-日期 */
    private String ruleDate ;
    /** 考勤组时间规则-开始时间 */
    private Date ruleStartTime ;
    /** 考勤组时间规则-结束时间 */
    private Date ruleEndTime ;
    /** 状态（1-有效，0-无效） */
    private String status ;
}
