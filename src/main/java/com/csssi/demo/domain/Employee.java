package com.csssi.demo.domain;

import java.io.Serializable;


public class Employee implements Serializable {

    private int empId;
    private String name;
    private short sex;
    private short level;
    private Department department;
    private double salary;

    public int getId() {
        return empId;
    }

    public void setId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    public short getLevel() {
        return level;
    }

    public void setLevel(short level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", level=" + level +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
