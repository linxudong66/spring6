package com.lxd.spring6.autowired.service;

import com.lxd.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author LXD
 */
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao ;
    @Override
    public void addUserService() {
        System.out.println("addUserService");
        userDao.addUserDao();
    }
}
