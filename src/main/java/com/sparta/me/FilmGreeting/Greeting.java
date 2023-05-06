package com.sparta.me.FilmGreeting;
/*
    Programming principles (Readability, Maintainability, Testability)
    1) Never code in the main! (main should just run the code)
    2) A method should only do one job (The method below is performing logic as well as printing)

        private static void getGreeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay <= 12)
        {
            System.out.println("Good morning!");
        }
        else if (timeOfDay >= 12 && timeOfDay <= 18)
        {
            System.out.println("Good afternoon!");
        }
        else        {
            System.out.println("Good evening!");
        }
    }

    3) Having methods that return void make it hard to test so have a return value for methods so that we can test them
 */
public class Greeting {
    public static void main(String[] args)
    {
        int timeOfDay = 16;
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(int timeOfDay) {
        String greeting = "";
        if (timeOfDay >= 0 && timeOfDay < 12)
        {
            greeting = "Good morning!";
        }
        else if (timeOfDay >= 12 && timeOfDay <= 18)
        {
            greeting = "Good afternoon!";
        }
        else if (timeOfDay >= 19 && timeOfDay <= 23){
            greeting = "Good evening!";
        }
        else        {
            greeting = "You have entered an incorrect value";
        }
        return greeting;
    }
}