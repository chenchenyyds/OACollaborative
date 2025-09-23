package com.hbqilufc.module.bpm.framework.flowable.core.candidate.strategy.dept;

import com.hbqilufc.framework.common.util.string.StrUtils;
import com.hbqilufc.module.bpm.framework.flowable.core.candidate.BpmTaskCandidateStrategy;
import com.hbqilufc.module.bpm.framework.flowable.core.enums.BpmTaskCandidateStrategyEnum;
import com.hbqilufc.module.system.api.dept.DeptApi;
import com.hbqilufc.module.system.api.user.AdminUserApi;
import com.hbqilufc.module.system.api.user.dto.AdminUserRespDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

import static com.hbqilufc.framework.common.util.collection.CollectionUtils.convertSet;

/**
 * 部门的成员 {@link BpmTaskCandidateStrategy} 实现类
 *
 * @author kyle
 */
@Component
public class BpmTaskCandidateDeptMemberStrategy implements BpmTaskCandidateStrategy {

    @Resource
    private DeptApi deptApi;
    @Resource
    private AdminUserApi adminUserApi;

    @Override
    public BpmTaskCandidateStrategyEnum getStrategy() {
        return BpmTaskCandidateStrategyEnum.DEPT_MEMBER;
    }

    @Override
    public void validateParam(String param) {
        Set<Long> deptIds = StrUtils.splitToLongSet(param);
        deptApi.validateDeptList(deptIds);
    }

    @Override
    public Set<Long> calculateUsers(String param) {
        Set<Long> deptIds = StrUtils.splitToLongSet(param);
        List<AdminUserRespDTO> users = adminUserApi.getUserListByDeptIds(deptIds);
        return convertSet(users, AdminUserRespDTO::getId);
    }

}