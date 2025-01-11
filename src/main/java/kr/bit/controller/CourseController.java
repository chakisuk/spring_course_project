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
import java.util.stream.Collectors;

@Controller
//@RequestMapping("/main")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Resource(name = "loginBean")
    private User loginBean;

    @GetMapping("/main")
    public String main(@RequestParam("user_idx") int user_idx, Model model) {
        // 사용자가 신청한 과목 목록 가져오기
        List<Subject> select_courses = courseService.getUserCourses(user_idx);
        model.addAttribute("select_courses", select_courses);

        // 전체 과목 목록 가져오기
        List<Subject> allSubjects = courseService.getAllCourses();

        // 신청한 과목을 제외한 리스트 생성
        List<Subject> availableSubjects = allSubjects.stream()
                .filter(subject -> select_courses.stream()
                        .noneMatch(selected -> selected.getSubject_idx() == subject.getSubject_idx()))
                .collect(Collectors.toList());

        model.addAttribute("subjects", availableSubjects);

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

        // 과목의 현재 수강인원 확인
        Subject subject = courseService.getSubjectByIdx(subject_idx);
        if (subject.getSubject_num() >= 20) {
            // 수강인원이 초과된 경우 처리
            model.addAttribute("user_idx", user_idx);
            return "user/add_fail";  // 실패 페이지로 이동
        }

        // 과목 신청
        courseService.addCourse(user_idx, subject_idx);

        model.addAttribute("user_idx", user_idx);
        return "user/add";
    }
}