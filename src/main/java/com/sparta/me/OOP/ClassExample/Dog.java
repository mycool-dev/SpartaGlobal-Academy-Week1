package com.sparta.me.OOP.ClassExample;

public class Dog extends Animal implements Playable {
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    //Polymorphism is when we override methods and have multiple different versions.
    public void speak(String owner) {
        System.out.println(getName() + " is speaking to " + owner);
    }//overloading is when you have multiple implementations of the same method (different parameters)

    @Override
    public void play() {
        System.out.println(getName() + " plays");
    }

    @Override
    void sleep() {

    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}
