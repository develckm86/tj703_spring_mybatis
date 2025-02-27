package com.tj703.l02_spring_mybatis.mapper;

import com.tj703.l02_spring_mybatis.dto.Salaries;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SalariesMapper {
    List<Salaries> findByEmpNo(int empNo);
    Long findSumSalaryByEmpNo(int empNo);
    //급여를 한번도 받은적 없으면 null을 하기 위해 long 이 아니라 Long을 사용
}