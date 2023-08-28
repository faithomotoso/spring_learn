package com.exmp.springdemoannotations.fortune;

public class SomeFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Whoopti woop";
    }
}
