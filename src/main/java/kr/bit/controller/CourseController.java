package kr.bit.controller;

import kr.bit.beans.Course;
import kr.bit.beans.Subject;
import kr.bit.beans.User;
import kr.bit.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Controller
//@RequestMapping("/main")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Resource(name = "loginBean")
    private User loginBean;

    @GetMapping("/main")
    public String main(@RequestParam("user_idx") int user_idx, Model model) {

        System.out.println(user_idx);

        List<Subject> subjects = courseService.getAllCourses();
        model.addAttribute("subjects", subjects);



        List<Subject> select_courses=courseService.getUserCourses(user_idx);
        model.addAttribute("select_courses", select_courses);

        return "main";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("user_idx") int user_idx,
                         @RequestParam("subject_idx") int subject_idx,
                         Model model) {

        // 신청과목 삭제
        courseService.deleteCourse(user_idx, subject_idx);

        model.addAttribute("user_idx", user_idx);


        return "user/delete";
    }

    @GetMapping("/add")
    public String add(@RequestParam("user_idx") int user_idx,
                      @RequestParam("subject_idx") int subject_idx,
                      Model model) {

        // 과목 신청
        courseService.addCourse(user_idx, subject_idx);

        model.addAttribute("user_idx", user_idx);

        return "user/add";
    }
}
