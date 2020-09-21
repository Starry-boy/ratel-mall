package com.ratel.mall.aop;

import com.baomidou.mybatisplus.extension.api.R;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 接口访问日志切面
 * @author ratel
 * @date 2020-09-21
 */
@Aspect
public class ApiAccessLogAspect {
    @Pointcut("@annotation(com.ratel.mall.annotation.ApiLog)")
    public void pointcut(){};

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){

    }
}
