package com.exmp.springdemo;

import com.exmp.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("file:src/main/java/com/exmp/springdemo/beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // Check if they are the same
        boolean result = theCoach == alphaCoach;

        System.out.println("Are they the same: " + result);

        System.out.println("Memory location of theCoach: " + theCoach);
        System.out.println("Memory location of alphaCoach: " + alphaCoach);

        context.close();
    }
}
