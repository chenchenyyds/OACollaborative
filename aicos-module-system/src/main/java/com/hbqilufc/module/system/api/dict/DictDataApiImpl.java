package com.hbqilufc.module.system.api.dict;

import com.hbqilufc.framework.common.util.object.BeanUtils;
import com.hbqilufc.framework.common.biz.system.dict.dto.DictDataRespDTO;
import com.hbqilufc.module.system.dal.dataobject.dict.DictDataDO;
import com.hbqilufc.module.system.service.dict.DictDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * 字典数据 API 实现类
 *
 * @author 芋道源码
 */
@Service
public class DictDataApiImpl implements DictDataApi {

    @Resource
    private DictDataService dictDataService;

    @Override
    public void validateDictDataList(String dictType, Collection<String> values) {
        dictDataService.validateDictDataList(dictType, values);
    }

    @Override
    public List<DictDataRespDTO> getDictDataList(String dictType) {
        List<DictDataDO> list = dictDataService.getDictDataListByDictType(dictType);
        return BeanUtils.toBean(list, DictDataRespDTO.class);
    }

}
