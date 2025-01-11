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
    private UserService userService;

    @Resource(name = "loginBean")
    private User loginBean;

    @GetMapping("/login")
    public String login(@ModelAttribute("loginProBean") User loginProBean,
                        Model model,
                        @RequestParam(value = "fail", defaultValue = "false") boolean fail) {
        model.addAttribute("fail", fail);
        return "user/login";
    }

    @PostMapping("/login_pro")
    public String login_pro(@Valid @ModelAttribute("loginProBean") User loginProBean,
                            BindingResult result,
                            Model model) {

        // Validation 에러 체크
        if(result.hasErrors()) {
            result.getAllErrors().forEach(error -> {
                System.out.println("Validation Error: " + error.getDefaultMessage());
            });
            return "user/login";
        }

        // 로그인 처리
        userService.getLoginUser(loginProBean);

        // 로그인 성공 시
        if(loginBean.isUserLogin()) {
            model.addAttribute("user_idx", loginBean.getUser_idx());
            System.out.println("로그인 성공 - user_idx: " + loginBean.getUser_idx());
            return "user/login_success";
        }
        // 로그인 실패 시
        else {
            model.addAttribute("loginFailMessage", "아이디 또는 비밀번호가 일치하지 않습니다");
            return "user/login";
        }
    }

    @GetMapping("/logout")
    public String logout() {
        loginBean.setUserLogin(false);
        return "user/logout";
    }
}