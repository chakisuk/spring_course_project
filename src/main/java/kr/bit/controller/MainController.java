package kr.bit.controller;

import kr.bit.beans.User;
import kr.bit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

//    @GetMapping("/main")
//    public String main(@ModelAttribute("loginProBean") User LoginProBean, Model model,
//                       @RequestParam(value = "fail", defaultValue = "false") boolean fail) {
//        model.addAttribute("fail", fail);
//
//        return "main";
//    }
    @GetMapping("/main")
    public String main(@ModelAttribute("loginProBean") User loginProBean) {
        return "main";
    }

//    @PostMapping("/login_pro")
//    public String loginPro(@Valid @ModelAttribute("loginProBean") User loginProBean, BindingResult result) {
//        if (result.hasErrors()) {
//            return "main";
//        }
//        return userService.getLoginUser(loginProBean);
//    }

}
