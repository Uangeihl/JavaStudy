package com.springboottest.a01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class A01Application {
    private static final Logger log = LoggerFactory.getLogger(A01Application.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(A01Application.class, args);
        System.out.println("context = " + context);
        context.getBean("aaa");
    }
}
