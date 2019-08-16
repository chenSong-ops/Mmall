package com.company.dao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Emp {
    private int empno;
    private String ename;
    private  String job;
    private int mgr;
    private BigDecimal sal;
    private BigDecimal comm;
    private Date hiredate;
    private int deptno;

    public Emp() {
    }

    public Emp(int empno, String ename, String job, int mgr, BigDecimal sal, BigDecimal comm, Date hiredate, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.sal = sal;
        this.comm = comm;
        this.hiredate = hiredate;
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", sal=" + sal +
                ", comm=" + comm +
                ", hiredate=" + hiredate +
                ", deptno=" + deptno +
                '}';
    }

    public Emp(int empno, String ename, Date hiredate, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.hiredate = hiredate;
        this.deptno = deptno;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
}
