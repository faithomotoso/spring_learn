package com.exmp.springdemo;

import com.exmp.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("file:src/main/java/com/exmp/springdemo/beanLifecycle-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
