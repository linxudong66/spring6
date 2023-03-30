package com.lxd.spring6.iocxml.dimap;

/**
 * @author LXD
 */
public class Lesson {
    private String lessonName ;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                '}';
    }
}
