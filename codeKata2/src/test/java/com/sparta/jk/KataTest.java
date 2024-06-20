package com.sparta.jk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class KataTest {

    @Test
    public void lengthTooShortReturnsFalse() {
        int[] shortArr = {1, 2};
        Assertions.assertFalse(Kata.threeMusketeers(shortArr));
    }
    @Test
    public void emptyReturnsFalse() {
        Assertions.assertFalse(Kata.threeMusketeers(new int[]{}));
    }
    @ParameterizedTest
    @MethodSource("providePositiveListsOfThreeWhichReturnTrue")
    public void positiveListsOfThreeWhichReturnTrue(int[] test, boolean result){
        Assertions.assertEquals(Kata.threeMusketeers(test), result);
    }
    public static Stream<Arguments> providePositiveListsOfThreeWhichReturnTrue(){
        return Stream.of(Arguments.of(new int[] {1,2,3,3,3,4}, true),
                         Arguments.of(new int[] {3,3,3}, true));
    }
    @ParameterizedTest
    @MethodSource("provideNegativeListsOfThreeWhichReturnTrue")
    public void negativeListsOfThreeWhichReturnTrue(int[] test, boolean result){
        Assertions.assertEquals(Kata.threeMusketeers(test), result);
    }
    public static Stream<Arguments> provideNegativeListsOfThreeWhichReturnTrue(){
        return Stream.of(Arguments.of(new int[] {-1,-2,-3,-3,-3,-4}, true),
                         Arguments.of(new int[] {-3,-3,-3}, true));
    }
    @ParameterizedTest
    @MethodSource("providePositiveListsOfThreeWhichReturnFalse")
    public void positiveListsOfThreeWhichReturnFalse(int[] test, boolean result){
        Assertions.assertEquals(Kata.threeMusketeers(test), result);
    }
    public static Stream<Arguments> providePositiveListsOfThreeWhichReturnFalse(){
        return Stream.of(Arguments.of(new int[] {1,2,3,3,4,4}, false),
                         Arguments.of(new int[] {3,3,1}, false));
    }
    @ParameterizedTest
    @MethodSource("provideNegativeListsOfThreeWhichReturnFalse")
    public void negativeListsOfThreeWhichReturnFalse(int[] test, boolean result){
        Assertions.assertEquals(Kata.threeMusketeers(test), result);
    }
    public static Stream<Arguments> provideNegativeListsOfThreeWhichReturnFalse(){
        return Stream.of(Arguments.of(new int[] {-1,-2,-3,-3,-4,-4}, false),
                         Arguments.of(new int[] {-3,-3,-1}, false));
    }
}
