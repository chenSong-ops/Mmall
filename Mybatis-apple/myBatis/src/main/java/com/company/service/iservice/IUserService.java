package com.company.service.iservice;

import com.company.dao.UserDao;
import com.company.dao.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

public interface IUserService {
   public User findById(Integer userId);
   public String trans(Integer src, Integer target, BigDecimal money);
   public String batchInsert(List<User> users);
   public String batchDelete(List<Integer> userIds);

}
