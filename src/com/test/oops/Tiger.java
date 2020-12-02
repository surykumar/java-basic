package com.test.oops;

public class Tiger extends Animal implements NonVegan {
    public void isVegan() {
        System.out.println("Tiger: Non Vegan");
    }
    void eat() {
        System.out.println("Tiger can eat meat");
    }
}
