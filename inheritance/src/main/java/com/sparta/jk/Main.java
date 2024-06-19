package com.sparta.jk;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("jeff", 4);
        System.out.println(dog.getNoise());
        System.out.println(dog.getWalkAction());
    }
}
