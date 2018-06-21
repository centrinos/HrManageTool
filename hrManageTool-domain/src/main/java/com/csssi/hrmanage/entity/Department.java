package com.csssi.hrmanage.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Department implements Serializable {

    private int deptId;
    private String deptName;
    private ArrayList<Employee> employees;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int depId) {
        this.deptId = depId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
