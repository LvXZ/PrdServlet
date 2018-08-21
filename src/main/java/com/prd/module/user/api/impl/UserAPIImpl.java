package com.prd.module.user.api.impl;

import com.prd.module.user.api.UserAPI;
import com.prd.module.user.dao.EmployeeDAO;
import com.prd.module.user.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-20  10:03
 */
@Component
public class UserAPIImpl implements UserAPI {


    @Autowired
    private EmployeeDAO employeeDAO;


    @Override
    public boolean findEmployeeExistByID(Employee employee) {

        Employee getEmployee = employeeDAO.selectPasswordByID(employee.getEmployeeId());
        if(getEmployee != null){

            if(getEmployee.getPassword().equals(employee.getPassword())){

                if(getEmployee.getEnableStatus() >= 1){

                    return true;

                }else{
                    return false;
                }

            }else{

                return false;
            }
        }
        return false;
    }

}
