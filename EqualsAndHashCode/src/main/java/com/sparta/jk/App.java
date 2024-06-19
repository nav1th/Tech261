package com.sparta.jk;

public class App {
    public static void main(String[] args) {
        Spartan spartan1 = new Spartan("bob", "ross");
        Spartan spartan2 = new Spartan("bob", "ross");
        System.out.println(spartan1.equals(spartan2));
        System.out.println("Hello".hashCode());
    }
}
