package kr.bit.dao;

import kr.bit.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDao {

    @Autowired
    private CourseMapper courseMapper;

    public void deleteCourse(int user_idx, int subject_idx) {
        courseMapper.deleteCourse(user_idx, subject_idx);
    }


}
