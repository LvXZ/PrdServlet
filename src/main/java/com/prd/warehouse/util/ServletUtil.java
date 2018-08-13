package com.prd.warehouse.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ServletUtil
 * @Description: 系统模块配置--切记篡改本类的任何方法
 * @Author: lvxz
 * @Date: 2018-08-13  13:56
 */

@Component
@ConfigurationProperties(prefix = "prdservlet")
public class ServletUtil {

    public static Map<String, String> configuration = new HashMap<>();
    public final static boolean shouldWarehouse = Boolean.valueOf(configuration.get("warehouse"));
    public final static boolean shouldUser = Boolean.valueOf(configuration.get("user"));
    public final static boolean shouldEconomy = Boolean.valueOf(configuration.get("economy"));

}
