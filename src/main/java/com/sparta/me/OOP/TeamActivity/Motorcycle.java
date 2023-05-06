package com.sparta.me.OOP.TeamActivity;

public class Motorcycle extends Vehicle implements Speed{
    public Motorcycle(String model, String manufacturer, String owner, int year) {
        super(model, manufacturer, owner, year);
    }

    @Override
    void MOT() {
        System.out.println("Motorcycle is due for MOT");
    }

    @Override
    public void speed() {
        System.out.println("Top speed 80mph");
    }
}
