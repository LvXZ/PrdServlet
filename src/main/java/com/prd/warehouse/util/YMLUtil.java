package com.prd.warehouse.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-14  17:33
 */


@Component
@ConfigurationProperties(prefix = "prdservlet")
public class YMLUtil {

    public static Map<String, Boolean> configuration = new HashMap<>();

    public static Map<String, Boolean> getConfiguration() {
        return configuration;
    }
}
