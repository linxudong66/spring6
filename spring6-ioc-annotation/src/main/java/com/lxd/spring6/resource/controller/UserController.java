package com.lxd.spring6.resource.controller;

import com.lxd.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * @author LXD
 */
@Controller("myUserController")
public class UserController {
    @Resource(name = "myUserService")
    private UserService userService ;

    public void addUser(){
        //调用service的方法
        System.out.println("controller");
        userService.addUserService();
    }
}
