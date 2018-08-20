package com.prd.user.api;

import com.prd.user.entity.Employee;
import org.springframework.stereotype.Component;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-20  10:02
 */


public interface UserAPI {


    boolean findEmployeeExistByID(Employee employee);
}
