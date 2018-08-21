package com.prd.module.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: HtmlController
 * @Description: 网页响应服务后端
 * @Author: lvxz
 * @Date: 2018-07-07  20:19
 */

@Controller
public class HtmlController {

    @RequestMapping("/")
    public String index1Page() {
        return "index.html";
    }

    @RequestMapping("/index")
    public String index2Page() {
        return "index.html";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login.html";
    }

}
