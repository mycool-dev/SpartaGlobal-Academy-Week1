package com.sparta.me.Bubblesort;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] unsortedNumbers = {4,2,65,8,12,9};
        //System.out.println("unsorted - " + Arrays.toString(unsortedNumbers));
        //System.out.println("sorted - " +Arrays.toString(sortedArray(unsortedNumbers)));
        System.out.println(Arrays.toString(bubbleArray(unsortedNumbers)));
    }
    public static int[] sortedArray (int[] unsortedNumbers){
        for (int i = 0; i < unsortedNumbers.length; i++)
            for (int j = 1; j < unsortedNumbers.length; j++)
                if(unsortedNumbers[j-1] > unsortedNumbers[j])
                    swap(unsortedNumbers, j);
        return unsortedNumbers;
    }

    private static void swap(int[] numberUnsorted, int iterator) {
        int temp = numberUnsorted[iterator - 1];
        numberUnsorted[iterator -1] = numberUnsorted[iterator];
        numberUnsorted[iterator] = temp;
    }


    public static int[] bubbleArray (int[] unsortedArray){
        for (int i = 0; i < unsortedArray.length; i++){
            for (int j = 1; j < unsortedArray.length; j++){
                if (unsortedArray[j-1] > unsortedArray[j]){
                    int temp = unsortedArray[j-1];
                    unsortedArray[j-1] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
        return unsortedArray;
    }
}
