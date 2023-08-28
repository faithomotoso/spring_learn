package com.exmp.springdemo.coach;

import com.exmp.springdemo.fortune.FortuneService;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void customStartup() {
        System.out.println("In custom startup for TrackCoach");
    }

    public void cleanup() {
        System.out.println("In cleanup for TrackCoach");
    }
}
