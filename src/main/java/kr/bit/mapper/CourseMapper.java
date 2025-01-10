package kr.bit.mapper;

import kr.bit.beans.Course;
import kr.bit.beans.Subject;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseMapper {

    // user_idx와 subject_idx로 선택한 과목 삭제
    @Delete("delete from course_table where user_idx=#{user_idx} and subject_idx=#{subject_idx}")
    void deleteCourse(int user_idx, int subject_idx);

    // 사용자 수강 과목 목록 가져오기(user_idx 기준으로 가져옴)
    @Select("SELECT s.* FROM subject_table s " +
            "JOIN course_table c ON s.subject_idx = c.subject_idx " +
            "WHERE c.user_idx = #{user_idx}")
    List<Subject> getUserCourses(int user_idx);

}
