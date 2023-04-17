package com.lxd.service.Impl;

import com.lxd.anno.Bean;
import com.lxd.anno.Di;
import com.lxd.dao.UserDao;
import com.lxd.service.UserService;

/**
 * @author LXD
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao ;

    @Override
    public void add() {
        System.out.println("service......");
        //调用dao的方法
        userDao.add();
    }
}
