package com.exmp.springdemo.coach;

import com.exmp.springdemo.fortune.FortuneService;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String teamName;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Throw 21 baseballs 200 yards.";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket coach says " + fortuneService.getFortune();
    }
}
