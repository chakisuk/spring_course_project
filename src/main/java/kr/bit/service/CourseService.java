package kr.bit.service;

import kr.bit.beans.Subject;
import kr.bit.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    public void deleteCourse(int user_idx, int subject_idx) {
        courseDao.deleteCourse(user_idx, subject_idx);
    }

    public void addCourse(int user_idx, int subject_idx) {
        courseDao.addCourse(user_idx, subject_idx);
    }

    public List<Subject> getUserCourses(int user_idx) {
        return courseDao.getUserCourses(user_idx);
    }

    public List<Subject> getAllCourses() {
        return courseDao.getAllCourses();
    }

    public Subject getSubjectByIdx(int subject_idx) {
        return courseDao.getSubjectByIdx(subject_idx);
    }

}