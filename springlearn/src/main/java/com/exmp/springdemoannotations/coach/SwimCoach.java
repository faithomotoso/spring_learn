package com.exmp.springdemoannotations.coach;

import com.exmp.springdemoannotations.fortune.FortuneService;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 10km for warmup";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
