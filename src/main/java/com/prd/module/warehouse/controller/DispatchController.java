package com.prd.module.warehouse.controller;

import com.prd.module.user.api.UserAPI;
import com.prd.dto.ResponseDTO;
import com.prd.module.warehouse.service.DispatchService;
import com.prd.module.warehouse.service.decorator.DispatchDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-09  10:30
 */

@RestController
@RequestMapping("/dispatch")
public class DispatchController {

    @Autowired
    private DispatchService dispatchService;

    @Autowired
    private UserAPI userAPI;

    @PostMapping(value = "/input", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> inputForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {

        response.setHeader("Access-Control-Allow-Methods", "POST");
        return new DispatchDecorator(dispatchService,userAPI).inputForm(params);
    }

    @PostMapping(value = "/output", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> outputForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {

        response.setHeader("Access-Control-Allow-Methods", "POST");
        return new DispatchDecorator(dispatchService,userAPI).outputForm(params);
    }

    @PostMapping(value = "/transfer", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> transferForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {

        response.setHeader("Access-Control-Allow-Methods", "POST");
        return new DispatchDecorator(dispatchService,userAPI).transferForm(params);
    }

}
