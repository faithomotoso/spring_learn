package com.exmp.springdemoannotations.config;

import com.exmp.springdemoannotations.coach.Coach;
import com.exmp.springdemoannotations.coach.SwimCoach;
import com.exmp.springdemoannotations.fortune.FortuneService;
import com.exmp.springdemoannotations.fortune.SomeFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.exmp.springdemoannotations")
@PropertySource("file:src/main/java/com/exmp/springdemoannotations/sport.properties")
public class SportConfig {

    // Define independent bean
    @Bean
    public FortuneService someFortuneService() {
        return new SomeFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(someFortuneService());
    }
}
