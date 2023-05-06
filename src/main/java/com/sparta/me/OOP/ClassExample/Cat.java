package com.sparta.me.OOP.ClassExample;

public class Cat extends Animal implements Playable{
    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    //right click generate to override parents methods
    @Override
    public void speak() {
        System.out.println("Cat's don't speak!");
    }//example of overriding (changing the parents method to your own)

    @Override
    void sleep() {

    }

    @Override
    public void play() {
        System.out.println(getName() + " plays");
    }


}
