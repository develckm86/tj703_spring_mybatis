package com.tj703.l02_spring_mybatis.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * salaries
 */
@Alias("Salaries")
@Data
public class Salaries {
    private Integer salary;
    private Integer empNo;
    private Date toDate;
    private Date fromDate;
}