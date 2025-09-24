package com.hbqilufc.module.oa.dal.dataobject.attendance;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hbqilufc.framework.mybatis.core.dataobject.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 考勤组所属员工表 oa_attendance_group_employee数据表的PO对象
 * @author : zzh
 * @date : 2025-9-24
 */
@TableName("oa_attendance_group_employee")
@Data
@EqualsAndHashCode(callSuper = true)
public class OaAttendanceGroupEmployeePO extends BaseDO {
    /** 主键ID */
    @TableId
    private long id ;
    /** 考勤组ID */
    private String groupId ;
    /** 员工ID */
    private String userId ;
    /** 所属年月 */
    private String yearMonth ;
    /** 剩余补卡次数 */
    private int remainingMakeUpCardTimes ;
}
