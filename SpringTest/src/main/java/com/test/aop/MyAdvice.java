package com.test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.test.dao.UserDao.print())")
    private void pt(){}

    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
    }
}
