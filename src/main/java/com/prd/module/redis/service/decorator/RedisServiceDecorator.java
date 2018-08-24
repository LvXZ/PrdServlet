package com.prd.module.redis.service.decorator;

import com.prd.dto.MessageDTO;
import com.prd.dto.ResponseDTO;
import com.prd.module.redis.dao.RedisEntityDao;
import com.prd.module.redis.entity.RedisEntity;
import com.prd.module.redis.service.RedisService;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prd.util.ServletUtil;

/**
 * @ClassName RedisServiceDecorator
 * @Description
 * @Author lin
 * @Date 2018/8/24 12:21
 * @DESCRIPT
 **/

public class RedisServiceDecorator implements RedisService {


    private RedisService redisService;
    private RedisEntityDao redisEntityDao;

    public RedisServiceDecorator(RedisService redisService, RedisEntityDao redisEntityDao) {
        this.redisService = redisService;
        this.redisEntityDao = redisEntityDao;
    }



    @Override
    public ResponseDTO<RedisEntity> doRedis(String params) {

        RedisEntity redisEntity = JSON.parseObject(params,RedisEntity.class);

        System.out.println(redisEntity.toString());

        if(!ServletUtil.SHOULD_REDIS){//查看模块是否激活
            return ResponseDTO.fail(MessageDTO.MODULE_REDIS);
        }



        return redisService.doRedis(params);
    }
}
