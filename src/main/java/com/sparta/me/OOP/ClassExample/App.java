package com.sparta.me.OOP.ClassExample;

public class App {
    public static void main(String[] args) {
        Dog max = new Dog("Max","Spaniel",7);
        Cat pebbles = new Cat("Pebbles","brown",3);
        System.out.println(max.getAge());
        //System.out.println(max.age = -12); gives an error because we have made the variables private
        System.out.println(pebbles.getBreed());
        max.speak();//method overloading
        max.speak("Brian");//method overloading
        pebbles.speak();
        max.play();
        pebbles.play();

        //Animal animal = new Dog();
        Animal animal = new Dog("Bob", "Tabby", 8);

        Playable animal2 = new Cat("Bob","Tabby",5);

    }
}
