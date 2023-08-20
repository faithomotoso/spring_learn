package com.exmp.springdemoannotations;

import com.exmp.springdemoannotations.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(
    "file:src/main/java/com/exmp/springdemoannotations/applicationContext.xml"
        );

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        context.close();
    }
}
