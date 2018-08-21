package com.prd.module.user.service.impl;

import com.prd.module.user.dao.EmployeeDAO;
import com.prd.module.user.entity.Employee;
import com.prd.module.user.service.LoginService;
import com.prd.dto.MessageDTO;
import com.prd.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-13  16:23
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private EmployeeDAO employeeDAO;


    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public ResponseDTO<Employee> findPasswordById(Employee employee) {

        Employee getEmployee = employeeDAO.selectPasswordByID(employee.getEmployeeId());

        if(getEmployee != null){

            if(getEmployee.getPassword().equals(employee.getPassword())){

                if(employee.getEnableStatus() > 1){

                    return ResponseDTO.success(MessageDTO.LOGIN_SUCCESS,getEmployee);

                }else{
                    return ResponseDTO.fail(MessageDTO.LOGIN_FAIL_2);
                }

            }else{

                return ResponseDTO.fail(MessageDTO.LOGIN_FAIL_1);
            }
        }
        return ResponseDTO.fail(MessageDTO.LOGIN_FAIL_3);
    }


}
