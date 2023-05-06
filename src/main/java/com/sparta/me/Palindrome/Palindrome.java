package com.sparta.me.Palindrome;

import java.util.ArrayList;
import java.util.List;

//You can use ⌘⌥L to REFORMAT
public class Palindrome {

    public static void main(String[] args) {
        String sentenceString = "This is a test sentence mum please look at my radar";
        String[] sentence = sentenceString.split(" ");
        //System.out.println(palindromeSentenceChecker(sentence));

        System.out.println(isPalindromeForLoop("radar"));
    }

    public static boolean isPalindrome(String originalWord) {//naming convention for boolean isX
        String reversedWord = "";
        if (validWord(originalWord)) {
            StringBuilder str = new StringBuilder();
            StringBuilder lowercaseString = str.append(originalWord.toLowerCase());
            reversedWord = lowercaseString.reverse().toString();
        }
        return reversedWord.equals(originalWord);
    }

    public static boolean isPalindromeForLoop(String originalWord){
        String[] originalWordArray = originalWord.split("");
        String reverse = "";
        for (int i = originalWord.length()-1; i >= 0;i--){
            reverse = reverse + originalWordArray[i];
        }
        return reverse.equals(originalWord);
    }

    private static boolean validWord(String originalWord) {
        return originalWord != null & originalWord.length() >= 3;
    }

    public static String palindromeSentenceChecker(String[] sentence) {
        List<String> listSentence = new ArrayList<String>();
        StringBuilder largestWord = new StringBuilder();
        for (String word :
                sentence) {
            if (isPalindrome(word)) {
                listSentence.add(word);
            }
        }
        if (listSentence.size() != 0) {
            largestWord.append(listSentence.get(0));
            for (String word :
                    listSentence) {
                if (largestWord.length() < word.length()) {
                    largestWord.replace(0, largestWord.length(), word);
                }
            }
        }
        return largestWord.toString();
    }
}
