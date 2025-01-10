package kr.bit.controller;

import kr.bit.beans.User;
import kr.bit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller //클라이언트의 요청 처리 , 뷰 반환
public class HomeController {

    @Autowired
    private UserService userService;

    //http://localhost:8080/url_mapping/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){  //핸들러 메소드
        return "redirect:/login"; //login.jsp를 첫 화면으로
    }

    @GetMapping("/login")
    public String main(){
        return "login";
    }
}
