package com.company.dao;

import com.company.dao.pojo.Dept;
import com.company.dao.pojo.Score;
import com.company.dao.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ORMDaoTest {
    @Autowired
    ORMDao ormDao;
    @Test
    public void findBySid() {
       Student student= ormDao.findBySid(1);
        System.err.println(student.getSid()+":"+student.getSname());
//        System.err.println(student.getDept().toString());
    }


    @Test
    public void findByDid() {
       Dept dept = ormDao.findByDid(1);
        System.err.println(dept.getDid()+":"+dept.getDname());
        for(Student s:dept.getStus()){
            System.err.println(s.toString());
        }
    }


    @Test
    public void findM2M() {
        Student student = ormDao.findM2M(1);
        System.err.println(student.getSname());
       for(Score s:student.getScores()){
           System.err.println(s.getCourse().getCname()+s.getScore());
       }
    }
}