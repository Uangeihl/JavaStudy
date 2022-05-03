package com.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(int com.test.dao.UserDao.printime(..))")
    private void pt(){}

//    @After("pt()")
    public void method(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println(System.currentTimeMillis());
    }

//    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println("before");
        args[0]=23;
        Object ret = proceedingJoinPoint.proceed(args);
        System.out.println("after");
        return ret;
    }
    @AfterReturning(value = "pt()",returning = "ret")
    public void afterreturning(Object ret) {
        System.out.println("afterreturning"+ret);
    }
}
