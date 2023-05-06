package com.sparta.me.OOP.ClassExample;
//an Interface defines what something can do NOT what something is (different to an abstract class which is something)
public interface Playable {

    int number = 5; //all children have access to this variable which is final and static

    void play();//methods in an interface are inherently abstract

    default void grow(){

    }
}
