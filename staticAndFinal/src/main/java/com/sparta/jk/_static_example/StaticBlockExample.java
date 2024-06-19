package com.sparta.jk._static_example;
import jav

import java.util.ArrayList;

public class StaticBlockExample {
    private static ArrayList<String> names = new ArrayList<>();
    static{
        names.add("Manish");
        names.add("Alex");
    }

    public static void main(String[] args) {

    }
}
