package com.sparta.jk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {
    // Print numbers in order
    // If the number is divisible by 3 print "Fizz"
    // If the number is divisible by 5 print "Buzz"
    // If it's divisible by both print "FizzBuzz"
    @ParameterizedTest
    @CsvSource(
    {"1,1",   "2,2", 
     "4,4",   "7,7"})
    void givenAnInputOfOneWhenFizzBuzzThenReturnsOne(int input, String expected){
        String actual =  FizzBuzz.getFizzBuzz(input);
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @ValueSource(ints = {15, 30, 60})
    void givenMultipleOfThreeAndFiveWhenFizzBuzzThenReturnsFizzBuzz(int input){
        String expected = "FizzBuzz";
        String actual = FizzBuzz.getFizzBuzz(input);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void givenMultipleOfThreeWhenFizzBuzzThenReturnsFizz(int input){
        String expected = "Fizz";
        String actual = FizzBuzz.getFizzBuzz(input);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 25})
    void givenMultipleOfFiveWhenFizzBuzzThenReturnsBuzz(int input){
        String expected = "Buzz";
        String actual = FizzBuzz.getFizzBuzz(input);
        Assertions.assertEquals(expected, actual);
    }

}
