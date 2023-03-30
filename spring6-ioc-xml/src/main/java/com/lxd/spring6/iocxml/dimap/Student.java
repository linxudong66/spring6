package com.lxd.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

/**
 * @author LXD
 */
public class Student {
    private List<Lesson> lessonList ;
    private Map<String,Teacher> teacherMap;
    private String sid ;
    private String sname ;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lessonList=" + lessonList +
                ", teacherMap=" + teacherMap +
                ", sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }

    public void run(){
        System.out.println(sid+"--"+sname);
        System.out.println(teacherMap);
        System.out.println(lessonList);
    }

}
