package com.tj703.l02_spring_mybatis.controller;

import com.tj703.l02_spring_mybatis.dto.Employees;
import com.tj703.l02_spring_mybatis.service.EmpoyeesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    @GetMapping("/read.do")
    public String read(
            Model model,
            @RequestParam int empNo
    ) {
        model.addAttribute("emp", empService.read(empNo));
        model.addAttribute("title","사원상세");
        return "emp/read";
    }

    @GetMapping("/modify.do")
    public String modify(
            @RequestParam int empNo,
            Model model) {
        model.addAttribute("emp", empService.read(empNo));
        model.addAttribute("title","사원 수정 양식");
        return "emp/modify";
    }
    @PostMapping("/modify.do")
    public String modifyAction(
            Employees emp,
            RedirectAttributes ra){
        //RedirectAttributes 파라미터 추가
        boolean result=false;
        result=empService.modify(emp);
        ra.addAttribute("empNo",emp.getEmpNo());
        if(result){
            return "redirect:/emp/read.do";
        }else{
            return "redirect:/emp/modify.do";
        }
    }
    @GetMapping("/register.do")
    public String register(Model model) {
        model.addAttribute("title","사원 등록 양식");
        return "emp/register";
    }
    //register.do post ->성공 상세, 실패 -> register
    //remove.do get ->성공 list, 실패 -> modify
}
