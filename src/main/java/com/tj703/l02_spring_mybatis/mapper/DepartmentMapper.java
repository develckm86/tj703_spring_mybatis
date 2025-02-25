package com.tj703.l02_spring_mybatis.mapper;

import com.tj703.l02_spring_mybatis.dto.DepartmentDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

//mybatis container(session factory) 에서 관리되는 객체
@Mapper
public interface DepartmentMapper { //==dao DataAccessObject
    List<DepartmentDto> findAll();
//    @Retention(RetentionPolicy.RUNTIME)
//    @Target(ElementType.METHOD)
//    @Results({
//            @Result(column = "dept_no",property = "deptNo"),
//            @Result(column = "dept_name",property = "deptName")
//    })
//    public @interface DeptResult{ }

    //@Select("SELECT dept_no deptNo,dept_name deptName FROM departments")
//    @Select("SELECT * FROM departments")
//    @Results({
//            @Result(column = "dept_no",property = "deptNo"),
//            @Result(column = "dept_name",property = "deptName")
//    })

//    List<DepartmentDto> findAll();
}
