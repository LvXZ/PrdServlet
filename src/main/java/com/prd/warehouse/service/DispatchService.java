package com.prd.warehouse.service;

import com.prd.warehouse.dto.ResponseDTO;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DispatchService
 * @Description: 库房出入库调度服务层接口
 * @Author: lvxz
 * @Date: 2018-08-01  14:44
 */

public interface DispatchService {

    /**
     * 订单验证并入库
     * @param formID
     * @return String
     */
    ResponseDTO<String> inputForm(String formID);

    /**
     * 订单验证并出库
     *
     * @param formID
     * @return String
     */
    ResponseDTO<String> outputForm(String formID);


    /**
     *
     * @param formID
     * @return
     */
    ResponseDTO<String> transferForm(String formID);



}
