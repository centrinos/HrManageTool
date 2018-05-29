package com.csssi.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Department implements Serializable {

    private int depId;
    private  String depName;
    private ArrayList<Employee> employees;

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
