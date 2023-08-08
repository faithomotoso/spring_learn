package com.exmp.springdemo.fortune;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Happy Day";
    }
}
