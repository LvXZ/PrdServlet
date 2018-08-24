
package com.prd.aspect.authority;

import com.prd.aspect.authority.AuthorityEnum;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * @ClassName PermissionNeed
 * @Description 自定义注解 这是一个注解，用来为接口添加注解，标识接口的所属模块
 * @Author lin
 * @DATE 2018/8/23 12:26
 **/


@Retention(RUNTIME) //保留至运行注解，用于枚举
@Target(METHOD)     //注解使用范围，当前指注解可使用范围的枚举集合
public @interface PermissionNeed {

    /**
     * 执行方法所需要的权限
     */

    AuthorityEnum value() default AuthorityEnum.NO_AUTHORITY;
}

