package com.sparta.me.Bubblesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubblesortTests {
    @Test
    @DisplayName("Check that 4,2,7,8,12,9 returns 2, 4, 7, 8, 9, 12")
    void checkForBubbleSort(){
        int[] unsortedArray = {4,2,7,8,12,9};
        int[] sortedArray = {2,4,7,8,9,12};
        Assertions.assertArrayEquals(sortedArray,Bubblesort.sortedArray(unsortedArray));
    }
}
