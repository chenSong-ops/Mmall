package com.company.dao;

import com.company.dao.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmpDaoTest {
    @Autowired
    EmpDao empDao;
    @Test
    public void empUpdate() {
        Emp emp  = new Emp();
        emp.setEmpno(1002);
        emp.setSal(new BigDecimal("7777"));
        int result = empDao.empUpdate(emp);

        System.err.println( result);

    }

    @Test
    public void EmpFind() {
        Emp emp  = new Emp();
        emp.setEmpno(1003);
        emp.setEname("sun");
        Emp result = empDao.EmpFind(emp);
        System.err.println(result);
    }

    @Test
    public void findByDept() {
        List<Emp> emps = empDao.findByDept(Arrays.asList(1,2,3,4));
        for(Emp e :emps){
            System.err.println(e);
        }
    }

    @Test
    public void findByDept2() {
        List<Emp> emps = empDao.findByDept2(new int[]{1,2,3});
        for(Emp e :emps){
            System.err.println(e);
        }
    }
    @Test
    public  void  findByCon(){
        Emp emp1=empDao.findByCon(null,"sun");
        Emp emp2=empDao.findByCon(1002,null);
        Emp emp3=empDao.findByCon(1002,"sun");
        System.err.println(emp1);
        System.err.println(emp2);
        System.err.println(emp3);
    }
}