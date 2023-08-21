package com.exmp.springdemoannotations.fortune;

import org.springframework.stereotype.Component;

@Component
public class RTFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return null;
    }
}
