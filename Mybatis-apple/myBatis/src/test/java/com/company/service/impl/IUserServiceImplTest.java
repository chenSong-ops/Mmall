package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.dao.pojo.User;
import com.company.service.iservice.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class IUserServiceImplTest {
@Autowired
    IUserService userService;
    @Test
    public void findById() {
    }

    @Test
    public void trans() {
    }

    @Test
    public void batchInsert() {
        User u1 = new User("aaa",new BigDecimal("11111"),new Date());
        User u2 = new User("bbb",new BigDecimal("22222"),new Date());
        User u3 = new User("ccc",new BigDecimal("33333"),new Date());        User u4 = new User("ddd",new BigDecimal("44444"),new Date());
        List<User> users = Arrays.asList(u1,u2,u3,u4);
        String msg = userService.batchInsert(users);
        System.err.println("**********************"+msg);
    }
    @Test
    public void batchDelete() {

        List<Integer> userIds = Arrays.asList(12,13,14,15);
        String msg = userService.batchDelete(userIds);
        System.err.println("**********************"+msg);
    }
}