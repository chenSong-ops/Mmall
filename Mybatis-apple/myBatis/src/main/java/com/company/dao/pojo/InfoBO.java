package com.company.dao.pojo;

public class InfoBO {
    private DateVO dateVO;
    private Emp emp;
    private Dept dept;

    @Override
    public String toString() {
        return "InfoBO{" +
                "dateVO=" + dateVO +
                ", emp=" + emp +
                ", dept=" + dept +
                '}';
    }

    public DateVO getDateVO() {
        return dateVO;
    }

    public void setDateVO(DateVO dateVO) {
        this.dateVO = dateVO;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public InfoBO(DateVO dateVO, Emp emp, Dept dept) {
        this.dateVO = dateVO;
        this.emp = emp;
        this.dept = dept;
    }

    public InfoBO() {
    }
}
