package com.tj703.l02_spring_mybatis.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * employees
 */
@Data
public class Employees implements Serializable {
    public enum Gender {
        M,F
    }
    private int empNo;
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate hireDate;
    //1:N fk emp_no
    private List<DeptEmp> deptEmps;


    private static final long serialVersionUID = 1L;
}