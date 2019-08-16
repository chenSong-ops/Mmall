package com.company.dao;

import com.company.dao.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface EmpDao {
    int empUpdate(Emp emp);
   Emp EmpFind(Emp emp);
   List<Emp> findByDept(List<Integer> deptnos);
    List<Emp> findByDept2(int[] deptnos);
    Emp findByCon(@Param("empno") Integer empno,@Param("ename") String ename);
}
