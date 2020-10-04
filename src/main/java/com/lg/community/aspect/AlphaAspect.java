package com.lg.community.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class AlphaAspect {

    @Pointcut(value = "execution(* com.lg.community.service.*.*(..))")
    public void pointcut() {

    }

    @Before(value = "pointcut()")
    public void before() {
        System.out.println("before");
    }

    @After(value = "pointcut()")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning(value = "pointcut()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    @AfterThrowing(value = "pointcut()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @Around(value = "pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        Object obj = joinPoint.proceed();
        System.out.println("around after");
        return obj;

    }
}
