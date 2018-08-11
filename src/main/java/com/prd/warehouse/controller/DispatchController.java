package com.prd.warehouse.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prd.warehouse.dto.MessageDTO;
import com.prd.warehouse.dto.ResponseDTO;
import com.prd.warehouse.service.DispatchService;
import com.prd.warehouse.service.impl.DispatchServiceImpl;
import com.prd.warehouse.service.proxy.DispatchServiceProxy;
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


        DispatchService proxy = new DispatchServiceProxy(new DispatchServiceImpl());

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode paramJson = null;
        try {
            paramJson = objectMapper.readTree(params);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String formID = paramJson.get("inputID").textValue();

        return proxy.inputForm(formID);

    }

    @PostMapping(value = "/output", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> outputForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode paramJson = null;
        try {
            paramJson = objectMapper.readTree(params);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String formID = paramJson.get("outputID").textValue();

        return dispatchService.outputForm(formID);
        //studentService.findStudentPasswordById(params, request, response);
    }

    @PostMapping(value = "/transfer", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> transferForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode paramJson = null;
        try {
            paramJson = objectMapper.readTree(params);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String formID = paramJson.get("transferID").textValue();

        return dispatchService.transferForm(formID);
        //studentService.findStudentPasswordById(params, request, response);
    }


    @PostMapping(value = "/test", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> test(HttpServletRequest request, HttpServletResponse response) {
        return ResponseDTO.success(MessageDTO.INPUT_SUCCESS,"lvxz");
        //studentService.findStudentPasswordById(params, request, response);
    }
}
