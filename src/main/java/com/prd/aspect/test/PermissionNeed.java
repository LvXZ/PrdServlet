
package com.prd.aspect.test;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * @ClassName PermissionNeed
 * @Description 自定义注解 这是一个注解，用来为接口添加注解，标识接口的所属模块
 * @Author lin
 * @DATE 2018/8/23 12:26
 * @DESCRIPT
 **/


@Retention(RUNTIME)//什么时候使用该注解
@Target(METHOD)//注解用于什么地方
public @interface PermissionNeed {

    /**
     * 执行方法所需要的权限
     */

    public AuthorityEnum value() default AuthorityEnum.NO_AUTHORITY;
}

