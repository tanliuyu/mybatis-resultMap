package com.tly.mybatis.pojo;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.emp_id
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    private Integer empId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.emp_name
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sex
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.age
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.dept_id
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    private Integer deptId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.emp_id
     *
     * @return the value of emp.emp_id
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.emp_id
     *
     * @param empId the value for emp.emp_id
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.emp_name
     *
     * @return the value of emp.emp_name
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.emp_name
     *
     * @param empName the value for emp.emp_name
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sex
     *
     * @return the value of emp.sex
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sex
     *
     * @param sex the value for emp.sex
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.age
     *
     * @return the value of emp.age
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.age
     *
     * @param age the value for emp.age
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.dept_id
     *
     * @return the value of emp.dept_id
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.dept_id
     *
     * @param deptId the value for emp.dept_id
     *
     * @mbggenerated Fri Sep 02 11:01:41 CST 2022
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}