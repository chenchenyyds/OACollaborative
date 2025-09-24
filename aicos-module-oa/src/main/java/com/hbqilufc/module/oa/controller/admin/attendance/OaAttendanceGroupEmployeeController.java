package com.hbqilufc.module.oa.controller.admin.attendance;

import com.hbqilufc.module.oa.controller.admin.attendance.vo.OaAttendanceGroupEmployeeVO;
import com.hbqilufc.module.oa.service.attendance.OaAttendanceGroupEmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import java.util.List;

/**
 * 考勤组所属员工表;(oa_attendance_group_employee)表控制层
 * @author : http://www.yonsum.com
 * @date : 2025-9-24
 */
@Tag(name = "考勤组所属员工表控制层接口")
@RestController
@RequestMapping("/oaAttendanceGroupEmployee")
public class OaAttendanceGroupEmployeeController{
    @Autowired
    private OaAttendanceGroupEmployeeService oaAttendanceGroupEmployeeService;

    /**
     * 通过ID查询单条数据 
     *
     * @param id 主键
     * @return 实例对象
     */
    @Operation(summary = "通过ID查询单个对象")
    @Parameter(name = "id", description = "主键ID")
    @GetMapping("/byId/{id}")
    public ResponseEntity<OaAttendanceGroupEmployeeVO> queryById(@PathVariable("id") long id){
        return ResponseEntity.ok(oaAttendanceGroupEmployeeService.queryById(id));
    }

    /**
     * 分页查询
     *
     * @param oaAttendanceGroupEmployee 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Operation(summary = "分页查询")
    @PostMapping("/paginQuery")
    public ResponseEntity<Page<OaAttendanceGroupEmployeeVO>> paginQuery(@RequestBody OaAttendanceGroupEmployeeVO oaAttendanceGroupEmployee, PageRequest pageRequest){
        //1.分页参数
        long current = pageRequest.getPageNumber();
        long size = pageRequest.getPageSize();
        //2.分页查询
        /*把Mybatis的分页对象做封装转换，MP的分页对象上有一些SQL敏感信息，还是通过spring的分页模型来封装数据吧*/
        com.baomidou.mybatisplus.extension.plugins.pagination.Page<OaAttendanceGroupEmployeeVO> pageResult = oaAttendanceGroupEmployeeService.paginQuery(oaAttendanceGroupEmployee, current,size);
        //3. 分页结果组装
        List<OaAttendanceGroupEmployeeVO> dataList = pageResult.getRecords();
        long total = pageResult.getTotal();
        PageImpl<OaAttendanceGroupEmployeeVO> retPage = new PageImpl<OaAttendanceGroupEmployeeVO>(dataList,pageRequest,total);
        return ResponseEntity.ok(retPage);
    }

    /**
     * 新增数据
     *
     * @param oaAttendanceGroupEmployee 实例对象
     * @return 实例对象
     */
    @Operation(summary = "新增数据")
    @PostMapping("/add")
    public ResponseEntity<OaAttendanceGroupEmployeeVO> add(@RequestBody OaAttendanceGroupEmployeeVO oaAttendanceGroupEmployee){
        return ResponseEntity.ok(oaAttendanceGroupEmployeeService.insert(oaAttendanceGroupEmployee));
    }

    /**
     * 更新数据
     *
     * @param oaAttendanceGroupEmployee 实例对象
     * @return 实例对象
     */
    @Operation(summary = "更新数据")
    @PutMapping("/update")
    public ResponseEntity<OaAttendanceGroupEmployeeVO> update(@RequestBody OaAttendanceGroupEmployeeVO oaAttendanceGroupEmployee){
        return ResponseEntity.ok(oaAttendanceGroupEmployeeService.update(oaAttendanceGroupEmployee));
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Operation(summary = "通过ID删除对象")
    @Parameter(name = "id", description = "主键ID")
    @DeleteMapping("/byId/{id}")
    public ResponseEntity<Integer> deleteById(@PathVariable("id") long id){
        return ResponseEntity.ok(oaAttendanceGroupEmployeeService.deleteById(id));
    }
}