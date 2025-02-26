package com.tj703.l02_spring_mybatis.service;

import com.tj703.l02_spring_mybatis.dto.Employees;
import com.tj703.l02_spring_mybatis.mapper.EmployeesMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //Transaction 을 관리하는 데 특화된 Component
@AllArgsConstructor //Lombok 필드를 생성화로 초기화
public class EmployeesServiceImp implements EmpoyeesService{
    //@Autowired
    private EmployeesMapper empMapper;

    //public EmployeesServiceImp(EmployeesMapper empMapper) {this.empMapper = empMapper;}

    @Override
    public List<Employees> readAll() {
//        List<Employees> readAll=null;
//        readAll = empMapper.findAll();
//        return  readAll;
        return empMapper.findAll();
    }

    @Override
    public Employees read(int empNo) {
        return empMapper.findById(empNo);
    }

    @Override
    public boolean modify(Employees employees) {
        return empMapper.update(employees)>0;
    }

    @Override
    public boolean register(Employees employees) {
        return empMapper.insert(employees)>0;
    }

    @Override
    public boolean remove(int empNo) {
        return empMapper.delete(empNo)>0;
    }
}
