package com.tj703.l02_spring_mybatis.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class DeptEmp {
    private int empNo;
    private String deptNo;
    private LocalDate fromDate;
    private LocalDate toDate;
    //N:1 fk dept_no
    private Departments dept;
}
