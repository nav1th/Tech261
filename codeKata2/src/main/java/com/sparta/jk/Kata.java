package com.sparta.jk;

public class Kata {
    public static boolean threeMusketeers(int[] intArr){
        if (intArr.length < 3 || intArr == null)
            return false;

        int counter = 1;

        for(int i=1; i < intArr.length && counter != 3; i++){
            if(intArr[i] == intArr[i-1])
                counter++;
            else
                counter = 1;
        }

        if (counter == 3)
            return true;
        else 
            return false;
    }
}
