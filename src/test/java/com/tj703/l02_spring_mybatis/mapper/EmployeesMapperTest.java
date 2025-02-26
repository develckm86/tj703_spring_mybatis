package com.tj703.l02_spring_mybatis.mapper;

import com.tj703.l02_spring_mybatis.dto.Employees;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeesMapperTest {
    @Autowired
    EmployeesMapper empMapper;
    @Order(1)
    @Test
    void findAll() {
        System.out.println(empMapper.findAll());
    }
    @Order(4)
    @Test
    void findById() {
        System.out.println(empMapper.findById(77));
    }
    @Order(2)
    @Test
    void insert() {
        Employees employees = new Employees();
        employees.setEmpNo(77);
        employees.setFirstName("경민");
        employees.setLastName("최");
        employees.setBirthDate(LocalDate.parse("1986-05-25"));
        employees.setHireDate(LocalDate.parse("2025-02-26"));
        employees.setGender(Employees.Gender.M);
        System.out.println(empMapper.insert(employees));
    }
    @Order(3)
    @Test
    void update() {
        Employees employees = new Employees();
        employees.setEmpNo(77);
        employees.setFirstName("상혁");
        employees.setLastName("김");
        employees.setBirthDate(LocalDate.parse("1886-01-01"));
        employees.setHireDate(LocalDate.parse("2024-02-26"));
        employees.setGender(Employees.Gender.F);
        System.out.println(empMapper.update(employees));

    }
    @Order(5)
    @Test
    void delete() {
        System.out.println(empMapper.delete(77));
    }
}