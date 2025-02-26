package com.tj703.l02_spring_mybatis.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * employees
 */
@Data
public class Employees implements Serializable {
    private int empNo;

    private Date birthDate;

    private String firstName;

    private String lastName;

    private Object gender;

    private Date hireDate;

    private static final long serialVersionUID = 1L;
}