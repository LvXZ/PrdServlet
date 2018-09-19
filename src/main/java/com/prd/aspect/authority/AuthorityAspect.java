package com.prd.aspect.authority;

import com.alibaba.fastjson.JSON;
import com.prd.module.user.entity.Employee;
import com.prd.module.warehouse0.service.DispatchService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @ClassName AuthorityAspect
 * @Description 面向controller层切向的拦截数据request、response、param的数据请求
 * @Author lin
 * @DATE 2018/8/23 14:30
 **/

@Aspect
@Component
public class AuthorityAspect {

    @Autowired
    private DispatchService dispatchService;


    @Around("execution(* com.prd.module.*.controller.*.*(..))) and @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public Object executeAround(ProceedingJoinPoint jp) throws Throwable {
        //获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        //从获取RequestAttributes中获取HttpServletResponse的信息//一般不会使用到响应response
        HttpServletResponse response = ((ServletRequestAttributes) requestAttributes).getResponse();


        //获取请求的方法
        Signature signature = jp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method targetMethod = methodSignature.getMethod();

        Method realMethod = jp.getTarget().getClass().getDeclaredMethod(signature.getName(), targetMethod.getParameterTypes());

        String realMethodName = realMethod.getName();
        String requestMethod = request.getMethod();
        System.out.println("requestMethod " + requestMethod);
        System.out.println("realMethodName " + realMethodName);

        Object  obj = null;
        String userString = jp.getArgs()[0].toString();//获取请求的json字符串
        Employee employee = JSON.parseObject(userString, Employee.class);

        if(isHasPermission(realMethod,employee.getEmployeeId())) {
            //用户拥有该方法权限时执行方法里面的内容
            obj =  jp.proceed();
        }else {
            //用户没有权限，则直接返回没有权限的通知
            System.out.println("该用户无权利进行该操作");

        }
        return obj;

    }


    /**
     * 判断用户是否拥有权限
     *
     * @param realMethod
     * @param userId
     * @return
     */
    private boolean isHasPermission(Method realMethod, Integer userId) {
        try {
            //如果指定类型的注释（PermissionModule.class）存在于此元素上,返回true
            if (realMethod.isAnnotationPresent(PermissionNeed.class)) {
                PermissionNeed permissionModule = realMethod.getAnnotation(PermissionNeed.class);
                //运行realMethod方法所需的权限
                AuthorityEnum needAuthority = permissionModule.value();//获取为controller设定的permission权限
                //若用户权限中包含needAuthority，返回true

                Employee employee = new Employee();
                employee.setAutoryity(AuthorityEnum.DISPATCH_IN);

                if(needAuthority.equals(employee.getAutoryity())){
                    System.out.println("验证通过，可以继续操作");
                    return  true;
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }


}
