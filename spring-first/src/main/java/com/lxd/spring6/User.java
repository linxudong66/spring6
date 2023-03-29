package com.lxd.spring6;

/**
 * @author LXD
 */
public class User {
    private String name ;
    private Person person ;
    public User(){
        System.out.println("无参构造..");
    }
    public void add(){
        System.out.println("add...");
    }
}
