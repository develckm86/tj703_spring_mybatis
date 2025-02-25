package com.tj703.l02_spring_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {
    //컨테이너에 있는 객체를 요구할때 사용 (존재하면 객체를 주입)
    //**주의 @Autowired 를 사용하는 객체는 같은 컨테이너에서 관리 되어야한다.
    @Autowired //타입을 부모 클래스로 작성하면 주입할 객체를 잘못 줄수 있어서 사용을 권장하지 않음
    private DataSource dataSource;


    @GetMapping("/")
    public String home(Model model) throws Exception {
        Connection conn =dataSource.getConnection(); //DataSource==UserManagerDBConn
        Statement st =conn.createStatement();
        ResultSet rs = st.executeQuery("select * from departments where dept_no = 'd002'");
        Map<String, String> map = new HashMap<>();
        if (rs.next()) {
            map.put("dept_no", rs.getString("dept_no"));
            map.put("dept_name", rs.getString("dept_name"));
        }
        rs.close();
        st.close();
        conn.close();
        System.out.println(map);
        model.addAttribute("dept", map);
        return "index";
    }

}
