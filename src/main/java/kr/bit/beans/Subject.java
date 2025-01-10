package kr.bit.beans;

public class Subject {

    private int subject_idx;
    private String subject_name;
    private int subject_grade;
    private int subject_num;
    private String subject_day;
    private String subject_time;

    private int subject_count;

    public int getSubject_count() {
        return subject_count;
    }

    public void setSubject_count(int subject_count) {
        this.subject_count = subject_count;
    }

    public int getSubject_idx() {
        return subject_idx;
    }

    public void setSubject_idx(int subject_idx) {
        this.subject_idx = subject_idx;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public int getSubject_grade() {
        return subject_grade;
    }

    public void setSubject_grade(int subject_grade) {
        this.subject_grade = subject_grade;
    }

    public int getSubject_num() {
        return subject_num;
    }

    public void setSubject_num(int subject_num) {
        this.subject_num = subject_num;
    }

    public String getSubject_day() {
        return subject_day;
    }

    public void setSubject_day(String subject_day) {
        this.subject_day = subject_day;
    }

    public String getSubject_time() {
        return subject_time;
    }

    public void setSubject_time(String subject_time) {
        this.subject_time = subject_time;
    }
}
