package com.sparta.me.Strings;

public class HashcodeAndEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println();

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

        System.out.println();

        System.out.println(s1.equals(s3));//compare string
        System.out.println(s1 == s3);//compare object*/
        System.out.println(s1 == s2);

        //s3.intern() adds a string to the string pool
    }
}
