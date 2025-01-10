package kr.bit.dao;

import kr.bit.beans.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubjectDao {

    @Autowired
    private kr.bit.mapper.subjectMapper subjectMapper;
    public List<Subject> getAllSubjects() {
        return getAllSubjects();
    }

    public List<Subject> getRegisteredSubjects(int user_idx) {
        return getRegisteredSubjects(user_idx);
    }

    public List<Subject> getAvailableSubjects(int user_idx) {
        return getAvailableSubjects(user_idx);
    }

    public void registerSubject(int subject_idx, int user_idx) {
        registerSubject(subject_idx, user_idx);
    }
}
