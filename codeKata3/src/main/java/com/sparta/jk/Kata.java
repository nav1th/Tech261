package com.sparta.jk;

public class Kata {
    public static boolean isPalindrome(String word){
        if(word == null)
            return false;
        if(word.length() < 3)
            return false;

        word = word.toLowerCase();

        return new StringBuilder(word).reverse().toString().equals(word);
    }
}
