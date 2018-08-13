package com.prd.warehouse.service.decorator;

import com.prd.warehouse.dto.ResponseDTO;
import com.prd.warehouse.service.DispatchService;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-13  10:16
 */
public class DispatchServiceDecorator implements DispatchService {


    //构造decorator对象
    private final DispatchService dispatchService;

    public DispatchServiceDecorator(DispatchService dispatchService) {
        this.dispatchService = dispatchService;
    }

    @Override
    public ResponseDTO<String> inputForm(String formID) {

        ResponseDTO<String> responseDTO = null;

        boolean shouldRollback = false;
        try {
            beginTransaction();


            responseDTO = dispatchService.inputForm(formID);


        } catch (Exception e) {
            shouldRollback = true;
            throw e;
        } finally {
            if (shouldRollback) {
                rollback();
                return responseDTO;
            } else {
                commit();
                return responseDTO;
            }
        }



    }

    @Override
    public ResponseDTO<String> outputForm(String formID) {
        return null;
    }

    @Override
    public ResponseDTO<String> transferForm(String formID) {
        return null;
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
