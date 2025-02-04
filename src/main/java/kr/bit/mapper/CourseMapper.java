package kr.bit.mapper;

import kr.bit.beans.Course;
import kr.bit.beans.Subject;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CourseMapper {

    // user_idx와 subject_idx로 선택한 과목 삭제
    @Delete("delete from course_table where user_idx=#{user_idx} and subject_idx=#{subject_idx}")
    void deleteCourse(@Param("user_idx") int user_idx, @Param("subject_idx") int subject_idx);

    @Update("update subject_table set subject_num = subject_num - 1 where subject_idx = #{subject_idx}")
    void decreaseSubjectNum(@Param("subject_idx") int subject_idx);

    @Insert("insert into course_table(subject_idx, user_idx) values(#{subject_idx}, #{user_idx})")
    void addCourse(@Param("user_idx") int user_idx, @Param("subject_idx") int subject_idx);

    @Update("update subject_table set subject_num = subject_num + 1 where subject_idx = #{subject_idx}")
    void addSubjectNum(@Param("subject_idx") int subject_idx);

    @Select("select * from subject_table")
    List<Subject> getAllCourses();

    // 사용자 수강 과목 목록 가져오기(user_idx 기준으로 가져옴)
    @Select("SELECT s.* FROM subject_table s " +
            "JOIN course_table c ON s.subject_idx = c.subject_idx " +
            "WHERE c.user_idx = #{user_idx}")
    List<Subject> getUserCourses(int user_idx);


    @Select("SELECT * FROM subject_table WHERE subject_idx = #{subject_idx}")
    Subject getSubjectByIdx(int subject_idx);

}
