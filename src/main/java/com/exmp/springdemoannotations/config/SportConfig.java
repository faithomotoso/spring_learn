package com.exmp.springdemoannotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.exmp.springdemoannotations")
@PropertySource("file:src/main/java/com/exmp/springdemoannotations/sport.properties")
public class SportConfig {
}
