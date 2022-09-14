package com.tly.result.mapper;

import com.tly.result.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    /**
     * 获取员工Id
     * @param empId
     * @return
     */
        Emp getEmpId(@Param("empId") Integer empId);
}
