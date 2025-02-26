package com.tj703.l02_spring_mybatis.service;

import com.tj703.l02_spring_mybatis.dto.Employees;

import java.util.List;

public interface EmpoyeesService {
    // /emp/list.do
    List<Employees> readAll();
    // /emp/detail.do?empNo=10001 && /emp/modify.do?empNo=10001
    Employees read(int empNo);
    // /emp/modify.do post
    boolean modify(Employees employees);
    // /emp/register.do post
    boolean register(Employees employees);
    // /emp/remove.do?empNo=10001
    boolean remove(int empNo);
}
