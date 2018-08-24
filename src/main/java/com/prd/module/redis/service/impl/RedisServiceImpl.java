package com.prd.module.redis.service.impl;

import com.prd.dto.ResponseDTO;
import com.prd.module.redis.entity.RedisEntity;
import com.prd.module.redis.service.RedisService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName RedisServiceImpl
 * @Description
 * @Author lin
 * @Date 2018/8/24 12:12
 * @DESCRIPT
 **/
@Service
public class RedisServiceImpl implements RedisService {
    @Override
    public ResponseDTO<RedisEntity> doRedis(String params) {



        return ResponseDTO.success(new RedisEntity(1001,"all"));
    }
}
