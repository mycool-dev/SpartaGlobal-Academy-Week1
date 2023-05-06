package com.sparta.me;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationTests {
    @ParameterizedTest
    @ValueSource(ints = {6,8,10})
    @DisplayName("Check that 6,8,10 returns U, PG & 12 films are available.")
    void checkForChild(int age){
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassification.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,16,17})
    @DisplayName("Check that 15,16,17 returns U, PG, 12 & 15 films are available.")
    void checkForTeen(int age){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassification.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {20,25,42})
    @DisplayName("Check that 20,25,42 returns All films are available.")
    void checkForAdult(int age){
        Assertions.assertEquals("All films are available.",FilmClassification.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {-6})
    @DisplayName("Check that -6 returns You have entered an incorrect age.")
    void checkForInvalidAge(int age){
        Assertions.assertEquals("You have entered an incorrect age.",FilmClassification.availableClassifications(age));
    }
}
