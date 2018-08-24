package com.prd.module.redis.controller;

import com.prd.aspect.authority.AuthorityEnum;
import com.prd.aspect.authority.PermissionNeed;
import com.prd.dto.ResponseDTO;
import com.prd.module.redis.dao.RedisEntityDao;
import com.prd.module.redis.entity.RedisEntity;
import com.prd.module.redis.service.RedisService;
import com.prd.module.redis.service.decorator.RedisServiceDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName RedisController
 * @Description
 * @Author lin
 * @Date 2018/8/24 10:56
 * @DESCRIPT
 **/

@RestController
@RequestMapping(value = "/redis")
public class RedisController {


    @Autowired
    RedisService redisService;

    @Autowired
    RedisEntityDao redisEntityDao;

    @PermissionNeed(value = AuthorityEnum.DISPATCH_IN)
    @PostMapping(value = "/doRedis")
    public ResponseDTO<RedisEntity> doRedis(@RequestBody String params,
                                            HttpServletRequest request,
                                            HttpServletResponse response){

        return new RedisServiceDecorator(redisService,redisEntityDao).doRedis(params);

    }

}
