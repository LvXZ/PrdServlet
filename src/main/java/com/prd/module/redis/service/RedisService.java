package com.prd.module.redis.service;

import com.prd.dto.ResponseDTO;
import com.prd.module.redis.entity.RedisEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName RedisService
 * @Description
 * @Author lin
 * @DATE 2018/8/24 12:10
 **/

public interface RedisService {

    ResponseDTO<RedisEntity> doRedis(String params);

}
