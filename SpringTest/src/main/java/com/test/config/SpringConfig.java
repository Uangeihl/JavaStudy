package com.test.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.test.dao", "com.test.service"})
//@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
public class SpringConfig {
}
