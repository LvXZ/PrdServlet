package com.prd.warehouse.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-14  18:23
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServletUtilTest {


    @Test
    public void findUserById() {

        Assert.assertEquals(true, ServletUtil.SHOULD_USER);
        Assert.assertEquals(true, ServletUtil.SHOULD_WAREHOUSE);
        Assert.assertEquals(true, ServletUtil.SHOULD_ECONOMY);

    }


}