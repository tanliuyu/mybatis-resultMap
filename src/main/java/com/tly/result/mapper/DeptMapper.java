package com.tly.result.mapper;

import com.tly.result.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    /**
     * 通过分布查询员工以及部门的信息
     * @return
     */
        Dept getEmpAndDept(@Param("deptId") Integer deptId);

        List<Dept> getEmpAndDeptByDeptId(@Param("deptId") Integer deptId);


}
