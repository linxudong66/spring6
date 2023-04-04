package com.lxd.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository("myUserRedisDao")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("dao redis ...");
    }
}
