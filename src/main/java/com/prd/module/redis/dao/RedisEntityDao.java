package com.prd.module.redis.dao;

import com.prd.module.redis.entity.RedisEntity;
import org.springframework.boot.autoconfigure.cache.CacheProperties;

/**
 * @ClassName RedisEntityDao
 * @Description
 * @Author lin
 * @DATE 2018/8/24 11:49
 **/
public interface RedisEntityDao {


    RedisEntity queryRedisEntityByEmployeeID(int employeeID);

}
