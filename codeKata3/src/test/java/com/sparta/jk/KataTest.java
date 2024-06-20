package com.sparta.jk;


import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class KataTest {

    @ParameterizedTest
    @ValueSource(strings = {"KaYaK", "DeED", "repApeR"})
    public void differentCaseWordIsPalindrome(String word){
        Assertions.assertTrue(Kata.isPalindrome(word));
    }
    @ParameterizedTest
    @ValueSource(strings = {"kayak", "deed", "REPAPER"})
    public void sameCaseWordIsPalindrome(String word){
        Assertions.assertTrue(Kata.isPalindrome(word));
    }
    @ParameterizedTest
    @ValueSource(strings = {"kaya k", "de E d", "RePA PER"})
    public void wordWithSpacesAffectsIfIsPalindrome(String word ){
        Assertions.assertFalse(Kata.isPalindrome(word));
    }
    @Test public void wordLessThanThreeReturnsFalse(){
        String word = "hi";
        Assertions.assertFalse(Kata.isPalindrome(word));
    }
    @Test public void nullReturnsFalse(){
        String word = null;
        Assertions.assertFalse(Kata.isPalindrome(word));
    }


}
