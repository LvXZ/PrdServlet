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
@ConfigurationProperties(prefix = "service-config")
public class YMLUtil {

    public static Map<String, Boolean> prdservlet = new HashMap<>();

    public Map<String, Boolean> getPrdservlet() {
        return prdservlet;
    }
}
