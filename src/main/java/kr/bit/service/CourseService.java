package kr.bit.service;

import kr.bit.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    public void deleteCourse(int user_idx, int subject_idx) {
        courseDao.deleteCourse(user_idx, subject_idx);
    }
}
