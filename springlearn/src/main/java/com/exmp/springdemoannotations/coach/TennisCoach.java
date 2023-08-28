package com.exmp.springdemoannotations.coach;

import com.exmp.springdemoannotations.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private final FortuneService fortuneService;

    @Value("${tennis.team}")
    private String teamName;
    @Autowired
    public TennisCoach(@Qualifier("crinnyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    //    @Autowired
//    @Qualifier("randomFortuneService")
//    public void doFortuneThings(FortuneService fortuneService) {
//        System.out.println("Method injected fortune service says: " + fortuneService.getFortune());
//        this.fortuneService = fortuneService;
//    }
    @Override
    public String getDailyWorkout() {
        return "When playing for " + this.teamName + ". " + "Practice backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
