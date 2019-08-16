package com.company.dao.pojo;

public class StudentM2M {
    private int sid;
    private String sname;

    public StudentM2M() {
    }

    @Override
    public String toString() {
        return "StudentM2M{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
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

    public StudentM2M(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
}
