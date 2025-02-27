package com.tj703.l02_spring_mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SalariesMapperTest {
    @Autowired
    SalariesMapper salariesMapper;
    @Test
    void findByEmpNo() {
        System.out.println(salariesMapper.findByEmpNo(10010));
    }

    @Test
    void findSumSalaryByEmpNo() {
        System.out.println(salariesMapper.findSumSalaryByEmpNo(10010));
        System.out.println(salariesMapper.findSumSalaryByEmpNo(77));
    }
}