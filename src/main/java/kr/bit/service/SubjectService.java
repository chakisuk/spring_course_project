package kr.bit.service;

import kr.bit.beans.Subject;
import kr.bit.dao.SubjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectDao subjectDao;

    public List<Subject> getAllSubjects() {
        return subjectDao.getAllSubjects();
    }

    public List<Subject> getRegisteredSubjects(int user_idx) {
        return subjectDao.getRegisteredSubjects(user_idx);
    }

    public List<Subject> getAvailableSubjects(int user_idx) {
        return subjectDao.getAvailableSubjects(user_idx);
    }

    public void registerSubject(int subject_idx, int user_idx) {
        subjectDao.registerSubject(subject_idx, user_idx);
    }
}
