package com.prd.user.service;

import com.prd.user.entity.Employee;
import com.prd.warehouse.dto.ResponseDTO;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-13  16:23
 */
public interface LoginService {



    ResponseDTO<Employee> findPasswordById(Employee employee);


}
