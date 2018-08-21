package com.prd.module.user.service.decorator;

import com.prd.module.user.entity.Employee;
import com.prd.module.user.service.LoginService;
import com.prd.dto.ResponseDTO;

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
