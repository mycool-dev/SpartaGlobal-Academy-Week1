package com.sparta.me.Enums;

import java.util.Arrays;
/*
    When comparing two enums they are compared based on the order in which they are added
    workday.compareTo(lastDay) = -4
    workDay.compareTo(midDay) = -2
    Below = - (negative number)
    Above = + (positive number)
 */

public enum Days {
    MON,
    TUE,
    WED,
    THU,
    FRI;

    public static void main(String[] args) {
        Days workDay = Days.MON;
        Days lastDay = Days.FRI;
        Days midDay = Days.WED;
        System.out.println(workDay.compareTo(midDay));

        System.out.println(Arrays.toString(Days.values()));//prints all the values of the ENUM
    }
}
