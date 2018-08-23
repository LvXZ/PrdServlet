package com.prd.module.user.entity;

import com.prd.aspect.test.AuthorityEnum;

public class Employee {

    private Integer employeeId;

    private String employeeName;

    private String password;

    private Integer enableStatus;

    private AuthorityEnum authority;

    public AuthorityEnum getAutoryity() {
        return authority;
    }

    public void setAutoryity(AuthorityEnum authority) {
        this.authority = authority;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", password='" + password + '\'' +
                ", enableStatus=" + enableStatus +
                ", authority=" + authority +
                '}';
    }
}