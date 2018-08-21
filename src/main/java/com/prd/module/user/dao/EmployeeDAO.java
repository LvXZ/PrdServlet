package com.prd.module.user.dao;

import com.prd.module.user.entity.Employee;

public interface EmployeeDAO {


    Employee selectPasswordByID(Integer employeeId);




    int deleteByPrimaryKey(Integer employeeId);

    int insert(Employee record);

    int insertSelective(Employee record);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}