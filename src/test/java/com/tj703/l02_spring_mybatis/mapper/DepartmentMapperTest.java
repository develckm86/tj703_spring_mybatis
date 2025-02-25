package com.tj703.l02_spring_mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
/// SpringBootTest : spring bean 컨테이너의 객체를 사용할 수 있게 주입해준다.
@SpringBootTest
class DepartmentMapperTest {
    @Autowired
    DepartmentMapper deptMapper;

    @Test
    void findAll() {
        System.out.println(deptMapper.findAll());
    }
}