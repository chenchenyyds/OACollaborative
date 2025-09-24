package com.hbqilufc.module.oa.dal.dataobject.attendance;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hbqilufc.framework.mybatis.core.dataobject.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 假勤申请记录表 oa_apply_record数据表的PO对象
 * @author : zzh
 * @date : 2025-9-24
 */
@TableName("oa_apply_record")
@Data
@EqualsAndHashCode(callSuper = true)
public class OaApplyRecordPO extends BaseDO {
    /** 主键ID,; */
    @TableId
    private long id ;
    /** 工作流ID,; */
    private String workFlowId ;
    /** 员工ID,; */
    private String userId ;
    /** 员工名称,; */
    private String userName ;
    /** 归属机构 / 部门代码,; */
    private String deptCode ;
    /** 申请类型,; */
    private String applyType ;
    /** 请假类型,; */
    private String leaveType ;
    /** 申请开始时间,; */
    private Date applyStartTime ;
    /** 申请结束时间,; */
    private Date applyEndTime ;
    /** 申请原因,; */
    private String applyReason ;
    /** 申请天数,; */
    private String applyDays ;
    /** 申请地点,; */
    private String applyLocation ;
    /** 申请描述,; */
    private String applyDescription ;
    /** 附件ID,; */
    private String attachmentId ;
}
