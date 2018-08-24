package com.prd.aspect.authority;

/**
 * @ClassName AuthorityEnum 枚举类
 * @Description 自定义枚举用户的权限，但实际项目中最好根据数据库建立权限
 * @Author lin
 * @DATE 2018/8/23 12:26
 **/
public enum AuthorityEnum {

    NO_AUTHORITY,   //无权限

    DISPATCH_ALL,   //所有权限

    DISPATCH_IN,    //入库权限

    DISPATCH_OUT    //出库权限

}
