package com.company.dao;

import com.company.dao.pojo.Dept;
import com.company.dao.pojo.Student;

import java.util.List;

public interface ORMDao {
    Student findBySid(Integer sid);
    Dept findByDid(Integer did);
    Student findM2M (Integer sid);
}
