package com.tly.result.pojo;

public class Emp {
    private Integer empId;
    private String empName;
    private String sex;
    private int age;
    private Dept deptId;

    public Emp() {
    }

    public Emp(Integer empId, String empName, String sex, int age, Dept deptId) {
        this.empId = empId;
        this.empName = empName;
        this.sex = sex;
        this.age = age;
        this.deptId = deptId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

    public Dept getDept() {
        return deptId;
    }

    public void setDept(Dept dept) {
        this.deptId = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dept=" + deptId +
                '}';
    }
}
