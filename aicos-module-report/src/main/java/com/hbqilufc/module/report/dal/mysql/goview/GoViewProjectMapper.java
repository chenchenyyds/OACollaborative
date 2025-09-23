package com.hbqilufc.module.report.dal.mysql.goview;

import com.hbqilufc.framework.common.pojo.PageParam;
import com.hbqilufc.framework.common.pojo.PageResult;
import com.hbqilufc.framework.mybatis.core.mapper.BaseMapperX;
import com.hbqilufc.framework.mybatis.core.query.LambdaQueryWrapperX;
import com.hbqilufc.module.report.dal.dataobject.goview.GoViewProjectDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoViewProjectMapper extends BaseMapperX<GoViewProjectDO> {

    default PageResult<GoViewProjectDO> selectPage(PageParam reqVO, Long userId) {
        return selectPage(reqVO, new LambdaQueryWrapperX<GoViewProjectDO>()
                .eq(GoViewProjectDO::getCreator, userId)
                .orderByDesc(GoViewProjectDO::getId));
    }

}
