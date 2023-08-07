package com.exmp.springdemo;

public class App {
    public static void main(String[] args) {
        Coach baseballCoach = new TrackCoach();

        System.out.println(baseballCoach.getDailyWorkout());
    }
}
