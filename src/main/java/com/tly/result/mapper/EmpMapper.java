package com.tly.result.mapper;

import com.tly.result.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    List<Emp> getAllEmp(Emp emp);

    /**
     * 获取员工和部门的信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptId(@Param("empId") Integer empId);

}
