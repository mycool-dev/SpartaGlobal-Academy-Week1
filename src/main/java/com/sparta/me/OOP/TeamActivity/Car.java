package com.sparta.me.OOP.TeamActivity;

public class Car extends Vehicle implements Speed{
    public Car(String model, String manufacturer, String owner, int year) {
        super(model, manufacturer, owner, year);
    }

    void MOT(String owner) {
        System.out.println(owner + " brings the car to the test");
    }


    @Override
    public void speed() {
        System.out.println("Top speed is 70mph");
    }
}
