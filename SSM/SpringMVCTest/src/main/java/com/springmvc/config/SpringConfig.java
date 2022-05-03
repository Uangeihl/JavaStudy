package com.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan({"com.springmvc.service","com.springmvc.dao"})
@ComponentScan(value = "com.springmvc",
    excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
            classes = Controller.class
    )
)
public class SpringConfig {
}
