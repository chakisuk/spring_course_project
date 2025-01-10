package kr.bit.mapper;

import org.apache.ibatis.annotations.Delete;

public interface CourseMapper {

    // user_idx와 subject_idx로 선택한 과목 삭제
    @Delete("delete from course_table where user_idx=#{user_idx} and subject_idx=#{subject_idx}")
    void deleteCourse(int user_idx, int subject_idx);

}
