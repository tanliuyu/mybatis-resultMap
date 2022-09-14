package com.tly.spring.Bean;

import java.util.Arrays;

public class Students {
    private Integer sid;
    private String sName;
    private String sex;
    private int age;
    private Clazz clazz;
    private String[] hobby;

    public Students(Integer sid, String sName, String sex, int age, Clazz clazz) {
        this.sid = sid;
        this.sName = sName;
        this.sex = sex;
        this.age = age;
        this.clazz = clazz;
    }

    public Students() {
    }

    public String[] getHobby() {return hobby;}

    public void setHobby(String[] hobby) {this.hobby = hobby;}

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Clazz getClazz() {return clazz;}

    public void setClazz(Clazz clazz) {this.clazz = clazz;}

    @Override
    public String toString() {
        return "Students{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", clazz=" + clazz +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
