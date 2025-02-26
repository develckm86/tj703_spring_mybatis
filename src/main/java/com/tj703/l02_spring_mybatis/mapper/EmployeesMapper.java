package com.tj703.l02_spring_mybatis.mapper;

import com.tj703.l02_spring_mybatis.dto.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeesMapper {
    List<Employees> findAll();
    Employees findById(@Param("no") int empNo);
}