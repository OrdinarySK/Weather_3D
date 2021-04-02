package com.springboot.springboot_demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName GlobeHandler
 * @Description 对所有controller层的请求进行拦截预处理，解决跨域问题
 * @Author luokai
 * @CreateDate 2019/7/16 9:35
 * @UPpdateUser luokai
 * @UpdateDate 2019/7/16 9:35
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
@Aspect
@Component
public class GlobeHandler {

    @Around("execution(* com.springboot.springboot_demo.controller..*(..))")
    public Object CORSAop(ProceedingJoinPoint pjp) throws Throwable{
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods","GET,POST,OPTIONS,PUT");
        Object proceed = pjp.proceed();
        return proceed;
    }
}
