package com.sparta.jk;

public class Program {
    public static void main(String[] args)
    {
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(int timeOfDay) {
        if(timeOfDay >= 24){
            throw new IllegalArgumentException("Time of day can't be more than 23");
        }
        else if(timeOfDay < 0){
            throw new IllegalArgumentException("Time of day can't be a negative number");
        }

        String greeting;

        if (timeOfDay >= 5 && timeOfDay <= 11)   // 05 - 11
        {
            greeting = "Good morning!";
        }
        else if (timeOfDay >= 12 && timeOfDay <= 18) // 12 - 18
        {
            greeting = "Good afternoon!";
        }
        else  // 19 - 04
        {
            greeting ="Good evening!";
        }

        return greeting;
    }

}
