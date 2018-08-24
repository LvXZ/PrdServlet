package com.prd.module.redis.entity;

/**
 * @ClassName RedisEntity
 * @Description
 * @Author lin
 * @Date 2018/8/24 11:43
 * @DESCRIPT
 **/
public class RedisEntity {
    private int employeeID;

    private String authorities;


    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }



    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public int getEmployeeID() {

        return employeeID;
    }

    public String getAuthorities() {
        return authorities;
    }

    public RedisEntity() {

    }

    public RedisEntity(int employeeID, String authorities) {
        this.employeeID = employeeID;
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "RedisEntity{" +
                "employeeID=" + employeeID +
                ", authorities='" + authorities + '\'' +
                '}';
    }
}
