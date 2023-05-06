package com.sparta.me.OOP.ClassExample;
//abstract classes cannot be instantiated

/*
Abstraction
using code without fundamentally understanding how it works
always write your code assuming someone else is going to use it
 */

/*
Inheritance
A class can only inherit from one parent (diamond problem - which method to use when inheriting from two parents with the same method)
 */
public abstract class Animal{

    /*
    Encapsulation
    Always make object fields private otherwise anyone can edit them
    This makes use of the ENCAPSULATION concept (encapsulation makes boundaries)
     */


    private String name;
    private String breed;
    private int age;

    //right click generate to add a constructor
    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    //right click generate to setters and getters
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    /*

    By getting rid of this method, we essentially are saying that the age can only be set when the object is first instantiated
    this follows the concept of encapsulation (setting boundaries)
    public void setAge(int age) {
        this.age = age;
    }

     */

    public void speak(){
        System.out.println(name + " is speaking");
    }

    //defining an abstract method in an abstract class (works similar to an interface in that it forces children to implement this method)
    abstract void sleep();
}
