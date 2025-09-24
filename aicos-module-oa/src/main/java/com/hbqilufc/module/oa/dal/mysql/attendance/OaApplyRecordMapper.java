package com.hbqilufc.module.oa.dal.mysql.attendance;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.hbqilufc.framework.mybatis.core.mapper.BaseMapperX;
import com.hbqilufc.module.oa.dal.dataobject.attendance.OaApplyRecordPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface OaApplyRecordMapper extends BaseMapperX<OaApplyRecordPO> {

    /**
     * 分页查询指定行数据
     *
     * @param page 分页参数
     * @param wrapper 动态查询条件
     * @return 分页对象列表
     */
    IPage<OaApplyRecordPO> selectByPage(IPage<OaApplyRecordPO> page , @Param(Constants.WRAPPER) Wrapper<OaApplyRecordPO> wrapper);
}
