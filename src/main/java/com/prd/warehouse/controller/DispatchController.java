package com.prd.warehouse.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prd.warehouse.dto.MessageDTO;
import com.prd.warehouse.dto.ResponseDTO;
import com.prd.warehouse.service.DispatchService;
import com.prd.warehouse.service.decorator.DispatchServiceDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    @PostMapping(value = "/input", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> inputForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {

        response.setHeader("Access-Control-Allow-Methods", "POST");
        return new DispatchServiceDecorator(dispatchService).inputForm(params);
    }

    @PostMapping(value = "/output", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> outputForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {

        response.setHeader("Access-Control-Allow-Methods", "POST");
        return new DispatchServiceDecorator(dispatchService).outputForm(params);
    }

    @PostMapping(value = "/transfer", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> transferForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {

        response.setHeader("Access-Control-Allow-Methods", "POST");
        return new DispatchServiceDecorator(dispatchService).transferForm(params);
    }

}
