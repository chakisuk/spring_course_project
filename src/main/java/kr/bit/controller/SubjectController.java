package kr.bit.controller;

import kr.bit.beans.Subject;
import kr.bit.beans.User;
import kr.bit.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @Resource(name = "loginBean")
    private User loginBean;

    @GetMapping("/list")
    public String list(Model model) {
        // 로그인한 사용자의 user_idx 가져오기
        int user_idx = loginBean.getUser_idx();

        // 수강 가능한 과목 목록
        List<Subject> availableSubjects = subjectService.getAvailableSubjects(user_idx);
        model.addAttribute("availableSubjects", availableSubjects);

        // 수강 신청한 과목 목록
        List<Subject> registeredSubjects = subjectService.getRegisteredSubjects(user_idx);
        model.addAttribute("registeredSubjects", registeredSubjects);

        return "subject/list";
    }

    @PostMapping("/register")
    public String register(@RequestParam("subject_idx") int subject_idx) {
        int user_idx = loginBean.getUser_idx();
        subjectService.registerSubject(subject_idx, user_idx);
        return "redirect:/subject/list";
    }
}
