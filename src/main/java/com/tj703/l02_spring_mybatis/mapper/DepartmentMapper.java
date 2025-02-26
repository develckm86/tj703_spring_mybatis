package com.tj703.l02_spring_mybatis.mapper;

import com.tj703.l02_spring_mybatis.dto.DepartmentDto;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

//mybatis container(session factory) 에서 관리되는 객체
@Mapper
public interface DepartmentMapper { //==dao DataAccessObject
    List<DepartmentDto> findAll();

}
