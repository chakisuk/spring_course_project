package kr.bit.controller;

import kr.bit.beans.Course;
import kr.bit.beans.Subject;
import kr.bit.beans.User;
import kr.bit.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
//@RequestMapping("/main")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Resource(name = "loginBean")
    private User loginBean;

    @GetMapping("/delete")
    public String delete(@RequestParam("user_idx") int user_idx,
                         @RequestParam("subject_idx") int subject_idx,
                         Model model) {

        // 신청과목 삭제
        courseService.deleteCourse(user_idx, subject_idx);

        // 삭제 후 사용자가 신청해둔 목록들 새로 list에 담기
        List<Subject> remainingCourses = courseService.getUserCourses(user_idx);

        // 담은거 모델에 추가
        model.addAttribute("remainSubjects", remainingCourses);

        return "main";
    }
}
