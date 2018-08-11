package com.prd.warehouse.dto;

import com.prd.warehouse.util.PropertiesUtil;

/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-07-26  18:02
 */
public class MessageDTO {

    private int code;
    private String msg;

    //general exception
    public static MessageDTO SERVER_ERROR = new MessageDTO(-505,"server_error");
    //public static MessageDTO SUCCESS = new MessageDTO(1,"success");

    //login
    //public static MessageDTO LOGIN_SUCCESS = new MessageDTO(-505,"server_error");
    public static MessageDTO LOGIN_FAIL_1 = new MessageDTO(-101,PropertiesUtil.getProperty("login.failure.msg"));
    public static MessageDTO LOGIN_FAIL_2 = new MessageDTO(-102,"登录失败，用户不存在");
    public static MessageDTO LOGIN_FAIL_3 = new MessageDTO(-103,"登录失败，你的账户已被冻结");


    public static MessageDTO INPUT_SUCCESS = new MessageDTO(1, PropertiesUtil.getProperty("login.success.msg"));
    public static MessageDTO INPUT_FAIL = new MessageDTO(-1,"入库失败");


    private MessageDTO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}
