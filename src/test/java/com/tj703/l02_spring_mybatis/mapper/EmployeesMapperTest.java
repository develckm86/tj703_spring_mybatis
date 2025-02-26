package com.tj703.l02_spring_mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeesMapperTest {
    @Autowired
    EmployeesMapper empMapper;

    @Test
    void findAll() {
        System.out.println(empMapper.findAll());
    }

    @Test
    void findById() {
        System.out.println(empMapper.findById(10001));
    }
}