package kr.bit.mapper;

import kr.bit.beans.Subject;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface subjectMapper {
    @Select("SELECT * FROM subject_table")
    List<Subject> getAllSubjects();

    @Select("SELECT s.* FROM subject_table s " +
            "JOIN course_table c ON s.subject_idx = c.subject_idx " +
            "WHERE c.user_idx = #{user_idx}")
    List<Subject> getRegisteredSubjects(int user_idx);

    @Select("SELECT s.* FROM subject_table s " +
            "WHERE s.subject_idx NOT IN " +
            "(SELECT c.subject_idx FROM course_table c WHERE c.user_idx = #{user_idx})")
    List<Subject> getAvailableSubjects(int user_idx);

    @Insert("INSERT INTO course_table (subject_idx, user_idx) VALUES (#{subject_idx}, #{user_idx})")
    void registerSubject(int subject_idx, int user_idx);
}
