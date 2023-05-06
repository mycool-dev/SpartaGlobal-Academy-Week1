package com.sparta.me.FilmGreeting;

public class FilmClassification {
    public static void main(String[] args) {

        int age = 14;
        System.out.println(availableClassifications(age));
    }

    public static String availableClassifications(int ageOfViewer)
    {
        String result = "";
        if (ageOfViewer > 0 && ageOfViewer <= 14 )
        {
            result = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer >= 15 && ageOfViewer < 18)
        {
            result = "U, PG, 12 & 15 films are available.";
        }
        else if(ageOfViewer >= 18)      {
            result = "All films are available.";
        }
        else {
            result = "You have entered an incorrect age.";
        }
        return result;
    }
}
