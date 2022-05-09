package com.test.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.test")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
public class SpringConfig {
}
