package com.lxd.spring6.resource.service;

import com.lxd.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


/**
 * @author LXD
 */
@Service("myUserService")
public class UserServiceImpl  implements UserService {
    @Resource
    private UserDao myUserDao ;
    @Override
    public void addUserService() {
        System.out.println("addUserService");
        myUserDao.addUserDao();
    }
}
