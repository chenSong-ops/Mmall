package com.company.dao.pojo;

import java.util.List;

public class Student {
    private int sid;
    private String sname;
    private List<Score> scores;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", scores=" + scores +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public Student(int sid, String sname, List<Score> scores) {
        this.sid = sid;
        this.sname = sname;
        this.scores = scores;
    }

    public Student() {
    }
}
