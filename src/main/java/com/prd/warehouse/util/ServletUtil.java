package com.prd.warehouse.util;


import com.prd.warehouse.util.YMLUtil;

/**
 * @ClassName: ServletUtil
 * @Description: 系统模块配置--切记篡改本类的任何方法
 * @Author: lvxz
 * @Date: 2018-08-13  13:56
 */

public class ServletUtil {

    /*@Autowired
    private YMLUtil ymlUtil;*/

    public final static boolean SHOULD_USER = YMLUtil.prdservlet.get("module-user");
    public final static boolean SHOULD_WAREHOUSE = YMLUtil.prdservlet.get("module-warehouse");
    public final static boolean SHOULD_ECONOMY = YMLUtil.prdservlet.get("module-economy");

}
