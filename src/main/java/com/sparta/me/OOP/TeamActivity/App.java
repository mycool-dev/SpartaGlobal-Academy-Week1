package com.sparta.me.OOP.TeamActivity;

public class App {
    public static void main(String[] args) {
        Car car = new Car("Civic","Honda","Dave",2007);
        System.out.println(car.getManufacturer());
        car.MOT();//references method from Vehicle super class
        car.MOT("Richard");//method overloading from car class

        Vehicle bike1 = new Motorcycle("R7","Harley-Davidson","Brian",2018);
        bike1.MOT();

        Motorcycle bike2 = new Motorcycle("R6","Yamaha","Ralph",2010);
        bike2.speed();
    }
}
