package kr.bit.controller;

import kr.bit.beans.User;
import kr.bit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService; // 컨트롤러 전후단계 - 비즈니스로직(service)

    @Resource(name = "loginBean")
    private User loginBean; //로그인 여부 확인하기 위해 세션영역에 담아 놓은거 주입받음

    @GetMapping("/login")
    public String login(@ModelAttribute("loginProBean") User loginProBean, Model model,
                        @RequestParam(value ="fail", defaultValue = "false") boolean fail) {

        model.addAttribute("fail", fail);

        return "user/login";
    }

    @PostMapping("/login_pro")
    public String login_pro(@Valid @ModelAttribute("loginProBean") User loginProBean,
                            BindingResult result, Model model, HttpSession session){

        System.out.println(loginProBean.getUser_idx()); // 0
        System.out.println(loginProBean.getUser_id()); // student
        System.out.println(loginProBean.getUser_pw()); // student

        if(result.hasErrors()) {
            return "user/login";
        }

        userService.getLoginUser(loginProBean);

        if(loginBean.isUserLogin()==true) {
            model.addAttribute("user_idx", loginBean.getUser_idx());
            System.out.println(loginBean.getUser_idx());

            return "user/login_success";
        } else {
            return "user/login_fail";
        }
    }
}