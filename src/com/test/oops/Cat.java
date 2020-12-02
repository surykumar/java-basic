package com.test.oops;

public class Cat extends Animal {
    private String breed =  "persian";
    void eat() {
        System.out.println("Cat can eat fish!");
    }
    void sound() {
        System.out.println("Cat: Meow");
    }
    String breed() {
        return breed;
    }
}
