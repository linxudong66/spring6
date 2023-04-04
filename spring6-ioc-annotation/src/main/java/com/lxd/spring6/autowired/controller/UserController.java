package com.lxd.spring6.autowired.controller;

import com.lxd.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author LXD
 */
@Controller
public class UserController {
//    // 第一种方式 属性注入
//    @Autowired
//    private UserService userService ;

    // 第二种方法 set方法注入
    private UserService userService ;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("controller");
        //调用service的方法
        userService.addUserService();
    }
}
