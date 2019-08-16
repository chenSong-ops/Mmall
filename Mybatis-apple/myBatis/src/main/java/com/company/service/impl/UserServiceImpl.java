package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.dao.pojo.User;
import com.company.service.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDao userDao;
    @Override
    public User findById(Integer userId) {
        return null;
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRES_NEW)
    public String trans(Integer src, Integer target, BigDecimal money) {
        User s = userDao.selectByPrimaryKey(src);
        s.setSal(s.getSal().subtract(money));
        int msg1 = userDao.updateByPrimaryKey(s);
//        System.err.println(100/0);
        User t = userDao.selectByPrimaryKey(target);
        t.setSal(t.getSal().add(money));
        int msg2 = userDao.updateByPrimaryKey(t);
        return msg1!=0&&msg2!=0?"success":"error";
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRES_NEW)
    public String batchInsert(List<User> users) {

        int a = userDao.batchInsert(users);
        return a>0?"success":"error";

    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRES_NEW)
    public String batchDelete(List<Integer> userIds) {
        int a = userDao.batchDelete(userIds);
        return a>0?"success":"error";
    }


}
