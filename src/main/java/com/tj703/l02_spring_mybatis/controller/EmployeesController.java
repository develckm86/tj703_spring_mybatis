package com.tj703.l02_spring_mybatis.controller;

import com.tj703.l02_spring_mybatis.service.EmpoyeesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
@AllArgsConstructor
public class EmployeesController {

    private EmpoyeesService empService;

    @GetMapping("/readAll.do")
    public String readAll(Model model) {
        model.addAttribute("emps", empService.readAll());
        //만약 오류
        //1. 스프링 웹앱이 실행안됨!
        //2. 500
        //3. null 인경우는 없고 만약 없으면  [] 를 반환
        return "emp/readAll";
    }

}
