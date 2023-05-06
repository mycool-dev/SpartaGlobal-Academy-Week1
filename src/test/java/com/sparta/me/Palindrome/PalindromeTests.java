package com.sparta.me.Palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTests {
    @ParameterizedTest
    @ValueSource(strings = {"madam","mum","radar"})
    @DisplayName("Check if madam & mum return true")
    void checkForWordTrue(String word){
        Assertions.assertEquals(true,Palindrome.isPalindrome(word));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Dog","tractor","Plane"})
    @DisplayName("Check if Dog, tractor & Plane return false")
    void checkForFalse(String word){
        Assertions.assertEquals(false,Palindrome.isPalindrome(word));
    }

    @ParameterizedTest
    @ValueSource(strings = {"This is a test sentence mum please look at my radar"})
    @DisplayName("Check if radar is returned in this sentence")
    void checkForSentenceTrue(String word) {
        Assertions.assertEquals("radar",Palindrome.palindromeSentenceChecker(word.split(" ")));
    }

    @ParameterizedTest
    @ValueSource(strings = {"This is a test sentence please look at my book"})
    @DisplayName("Check if nothing is returned in this sentence")
    void checkForSentenceFalse(String word) {
        Assertions.assertEquals("",Palindrome.palindromeSentenceChecker(word.split(" ")));
    }
}
