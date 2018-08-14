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

public class ServletUtil {

    public final static boolean shouldWarehouse = YMLUtil.configuration.get("module-user");
    public final static boolean shouldUser = YMLUtil.configuration.get("module-warehouse");
    public final static boolean shouldEconomy = YMLUtil.configuration.get("module-economy");

}
