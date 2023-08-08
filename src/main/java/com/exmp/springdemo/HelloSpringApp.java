package com.exmp.springdemo;

import com.exmp.springdemo.coach.Coach;
import com.exmp.springdemo.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "file:src/main/java/com/exmp/springdemo/applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());
        System.out.println();

        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getTeamName());
        System.out.println(cricketCoach.getEmailAddress());

        context.close();
    }
}
