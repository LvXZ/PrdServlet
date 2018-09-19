package com.prd.module.warehouse0.controller;

import com.prd.aspect.authority.AuthorityEnum;
import com.prd.aspect.authority.PermissionNeed;
import com.prd.dto.ResponseDTO;
import com.prd.module.redis.service.RedisService;
import com.prd.module.user.api.UserAPI;
import com.prd.module.warehouse0.service.DispatchService;
import com.prd.module.warehouse0.service.decorator.DispatchDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: DispatchController
 * @Description: 库房管理 0.0 控制层
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

    @Autowired
    private RedisService redisService;

    @PermissionNeed(value = AuthorityEnum.DISPATCH_IN)
    @PostMapping(value = "/input", produces = "application/json;charset=UTF-8")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> inputForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {

        return new DispatchDecorator(dispatchService,userAPI,redisService).inputForm(params);
    }

    @PostMapping(value = "/output")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> outputForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {

        return new DispatchDecorator(dispatchService,userAPI,redisService).outputForm(params);
    }

    @PostMapping(value = "/transfer")
    @CrossOrigin(allowCredentials = "false")
    public ResponseDTO<String> transferForm(@RequestBody String params, HttpServletRequest request, HttpServletResponse response) {
        return new DispatchDecorator(dispatchService,userAPI,redisService).transferForm(params);
    }


}
