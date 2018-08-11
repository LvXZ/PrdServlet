package com.prd.warehouse.service.proxy;

import com.prd.warehouse.dto.ResponseDTO;
import com.prd.warehouse.service.DispatchService;
import com.prd.warehouse.service.impl.DispatchServiceImpl;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-09  17:41
 */
public class DispatchServiceProxy implements DispatchService {


    private DispatchServiceImpl dispatchService;

    public DispatchServiceProxy(DispatchServiceImpl dispatchService) {
        this.dispatchService = dispatchService;
    }

    @Override
    public ResponseDTO<String> inputForm(String formID) {

        System.out.println("proxy1--"+formID);



        ResponseDTO<String> string = dispatchService.inputForm(formID);





        System.out.println("proxy2");
        return string;
    }

    @Override
    public ResponseDTO<String> outputForm(String formID) {
        return null;
    }

    @Override
    public ResponseDTO<String> transferForm(String formID) {
        return null;
    }
}
