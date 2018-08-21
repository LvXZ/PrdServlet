package com.prd.module.user.service;

import com.prd.module.user.entity.Employee;
import com.prd.dto.ResponseDTO;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-13  16:23
 */
public interface LoginService {



    ResponseDTO<Employee> findPasswordById(Employee employee);


}
