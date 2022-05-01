package com.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan ("com.springmvc.controller")
@EnableWebMvc //Json数据支持
public class SpringMvcConfig {
}
