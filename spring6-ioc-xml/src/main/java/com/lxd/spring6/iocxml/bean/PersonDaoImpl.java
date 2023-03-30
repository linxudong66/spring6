package com.lxd.spring6.iocxml.bean;

/**
 * @author LXD
 */
public class PersonDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("run----");
    }
}
