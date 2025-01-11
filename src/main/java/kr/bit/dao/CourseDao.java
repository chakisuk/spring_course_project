package kr.bit.dao;

import kr.bit.beans.Subject;
import kr.bit.mapper.CourseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDao {

    @Autowired
    private CourseMapper courseMapper;

    public void deleteCourse(int user_idx, int subject_idx) {
        courseMapper.deleteCourse(user_idx, subject_idx);
        courseMapper.decreaseSubjectNum(subject_idx);
    }

    public void addCourse(int user_idx, int subject_idx) {
        courseMapper.addSubjectNum(subject_idx);
        courseMapper.addCourse(user_idx, subject_idx);
    }

    public List<Subject> getUserCourses(int user_idx) {
        return courseMapper.getUserCourses(user_idx);
    }

    //전체
    public List<Subject> getAllCourses() {
        return courseMapper.getAllCourses();
    }

    public Subject getSubjectByIdx(int subject_idx) {
        return courseMapper.getSubjectByIdx(subject_idx);
    }

}