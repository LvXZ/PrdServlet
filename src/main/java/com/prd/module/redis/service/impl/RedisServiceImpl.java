package com.prd.module.redis.service.impl;

import com.prd.dto.ResponseDTO;
import com.prd.module.redis.dao.RedisEntityDao;
import com.prd.module.redis.entity.RedisEntity;
import com.prd.module.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
@Component
public class RedisServiceImpl implements RedisService {


    @Autowired
    private RedisEntityDao redisEntityDao;


    @Override
    public ResponseDTO<RedisEntity> doRedis(String params) {

        redisEntityDao.queryRedisEntityByEmployeeID(123);

        return ResponseDTO.success(new RedisEntity(1001,"all"));
    }
}
