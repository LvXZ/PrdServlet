package com.prd.module.user.api;

import com.prd.module.user.entity.Employee;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-20  10:02
 */


public interface UserAPI {


    boolean findEmployeeExistByID(Employee employee);
}
