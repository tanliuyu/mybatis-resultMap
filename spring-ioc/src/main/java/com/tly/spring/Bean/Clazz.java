package com.tly.spring.Bean;

import java.util.List;

public class Clazz {
    private  String  clazzId;
    private  String  clazzName;
    private List<Students> students;

    public Clazz() {
    }

    public Clazz(String clazzId, String clazzName) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzId='" + clazzId + '\'' +
                ", clazzName='" + clazzName + '\'' +
                ", students=" + students +
                '}';
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public String getClazzId() {
        return clazzId;
    }

    public void setClazzId(String clazzId) {
        this.clazzId = clazzId;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

}
