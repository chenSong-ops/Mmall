package com.company.dao.pojo;

public class enameDnameDTO {
    private String ename;
    private String dname;
    private int deptno;

    @Override
    public String toString() {
        return "enameDnameDTO{" +
                "ename='" + ename + '\'' +
                ", dname='" + dname + '\'' +
                ", deptno=" + deptno +
                '}';
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public enameDnameDTO(String ename, String dname, int deptno) {
        this.ename = ename;
        this.dname = dname;
        this.deptno = deptno;
    }

    public enameDnameDTO() {
    }
}
