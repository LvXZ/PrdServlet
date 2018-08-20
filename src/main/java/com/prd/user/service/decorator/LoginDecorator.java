package com.prd.user.service.decorator;

import com.prd.user.entity.Employee;
import com.prd.user.service.LoginService;
import com.prd.warehouse.dto.MessageDTO;
import com.prd.warehouse.dto.ResponseDTO;
import com.prd.warehouse.util.ServletUtil;
import org.springframework.stereotype.Component;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-13  16:24
 */

public class LoginDecorator implements LoginService {

    private LoginService loginService;

    public LoginDecorator(LoginService loginService) {
        this.loginService = loginService;
    }



    @Override
    public ResponseDTO<Employee> findPasswordById(Employee employee) {

        ResponseDTO<Employee> responseDTO = null;
        boolean shouldRollback = false;
        try {
            beginTransaction();
            responseDTO = loginService.findPasswordById(employee);
        } catch (Exception e) {
            shouldRollback = true;
            throw e;
        } finally {
            if (shouldRollback) {
                rollback();
            } else {
                commit();
            }
            return responseDTO;
        }


    }

    private void commit() {
        System.out.println("commit");
    }

    private void rollback() {
        System.out.println("rollback");
    }

    private void beginTransaction() {
        System.out.println("beginTransaction");
    }
}
