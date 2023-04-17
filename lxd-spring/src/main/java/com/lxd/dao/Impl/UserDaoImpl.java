package com.lxd.dao.Impl;

import com.lxd.anno.Bean;
import com.lxd.dao.UserDao;

/**
 * @author LXD
 */
@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao.......");
    }
}
