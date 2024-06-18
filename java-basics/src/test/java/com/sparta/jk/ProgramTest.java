package com.sparta.jk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTest {
    @Test
    @DisplayName("GIVEN a time of 11, THEN greeting should return 'Good morning!'")
    void check11ReturnGoodMorning(){
        int timeOfDay = 11; 
        String expectedGreeting = "Good morning!";
        String actualGreeting = Program.getGreeting(timeOfDay);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    @Test
    @DisplayName("GIVEN a time of 13, THEN greeting should return 'Good afternoon!'")
    void check13ReturnsGoodAfternoon(){
        int timeOfDay = 13;
        String expectedGreeting = "Good afternoon!";
        String actualGreeting = Program.getGreeting(timeOfDay);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    @Test
    @DisplayName("GIVEN a time of 21, THEN greeting should return 'Good evening!'")
    void check21ReturnsGoodEvening(){
        int timeOfDay = 21; 
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(timeOfDay);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    @Test
    @DisplayName("GIVEN a time of over 23, THEN a error should be returned with the message 'Time of day can't be more than 23'")
    void checkOver23ReturnsError(){
        int timeOfDay = 24;
        String expectedErrorMessage = "Time of day can't be more than 23";
        String actualErrorMessage = Assertions.assertThrows(IllegalArgumentException.class, () -> Program.getGreeting(timeOfDay)).getMessage();
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

    @Test
    @DisplayName("GIVEN a time of under 0, THEN a error should be returned with the message 'Time of day can't be a negative number'")
    void checkUnder0ReturnsError(){
        int timeOfDay = -1;
        String expectedErrorMessage = "Time of day can't be a negative number";
        String actualErrorMessage = Assertions.assertThrows(IllegalArgumentException.class, () -> Program.getGreeting(timeOfDay)).getMessage();
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);

    }
}
