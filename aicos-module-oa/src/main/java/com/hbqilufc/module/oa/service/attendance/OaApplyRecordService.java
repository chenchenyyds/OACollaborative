package com.hbqilufc.module.oa.service.attendance;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hbqilufc.module.oa.controller.admin.attendance.vo.OaApplyRecordVO;

/**
 * 假勤申请记录表;(oa_apply_record)表服务接口
 * @author : http://www.yonsum.com
 * @date : 2025-9-24
 */
public interface OaApplyRecordService{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OaApplyRecordVO queryById(long id);

    /**
     * 分页查询
     *
     * @param oaApplyRecord 筛选条件
     * @param current 当前页码
     * @param size  每页大小
     * @return
     */
    Page<OaApplyRecordVO> paginQuery(OaApplyRecordVO oaApplyRecord, long current, long size);
    /**
     * 新增数据
     *
     * @param oaApplyRecord 实例对象
     * @return 实例对象
     */
    OaApplyRecordVO insert(OaApplyRecordVO oaApplyRecord);
    /**
     * 更新数据
     *
     * @param oaApplyRecord 实例对象
     * @return 实例对象
     */
    OaApplyRecordVO update(OaApplyRecordVO oaApplyRecord);
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    Integer deleteById(long id);
}