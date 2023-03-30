package com.lxd.spring6.iocxml.ditest;

import java.util.List;

/**
 * @author LXD
 * 部门
 */
public class Dept {
    private List<Emp> empList ;
    private String dname ;

    public String getDname() {
        return dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void info(){

        System.out.println("B M M C :" + dname);
       for (Emp emp : empList){
           System.out.println(emp.getEname() +"--age--"+ emp.getAge());
       }
    }

}
