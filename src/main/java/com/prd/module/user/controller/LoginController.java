package com.prd.module.user.controller;

import com.prd.dto.ResponseDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-13  17:35
 */

@RestController
@RequestMapping("/user")
public class LoginController {

    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> inputForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {

        response.setHeader("Access-Control-Allow-Methods", "POST");
        return null;
    }
}
