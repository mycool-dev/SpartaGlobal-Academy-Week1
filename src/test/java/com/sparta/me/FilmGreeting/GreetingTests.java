package com.sparta.me.FilmGreeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GreetingTests {

    @Test
    @DisplayName("Check that 7 returns Good Morning")
    void checkForGoodMorning(){
        Assertions.assertEquals("Good morning!", Greeting.getGreeting(7));
    }

    //Parameterized Test (check multiple values)

    @ParameterizedTest
    @ValueSource(ints = {5,8,11})
    @DisplayName("check that 5,8,11 returns Good Morning")
    void checkForGoodMorning(int time){
        Assertions.assertEquals("Good morning!",Greeting.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {12,14,18})
    @DisplayName("check that 12,14,18 returns Good Afternoon")
    void checkForGoodAfternoon(int time){
        Assertions.assertEquals("Good afternoon!",Greeting.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {19,21,23})
    @DisplayName("check that 19,21,23 returns Good Afternoon")
    void checkForGoodEvening(int time){
        Assertions.assertEquals("Good evening!",Greeting.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {100,63,-18})
    @DisplayName("check that 100,63,-18 returns incorrect value")
    void checkForInvalidNumber(int time){
        Assertions.assertEquals("You have entered an incorrect value",Greeting.getGreeting(time));
    }
}
