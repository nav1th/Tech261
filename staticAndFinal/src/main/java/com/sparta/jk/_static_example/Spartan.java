package com.sparta.jk._static_example;

public class Spartan {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Spartan.name = name;
    }
    public void printSpartan(Spartan spartan){
        System.out.println("name: " + spartan.getName());
    }
}
