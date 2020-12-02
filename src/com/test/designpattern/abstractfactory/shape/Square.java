package com.test.designpattern.abstractfactory.shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Sqaure::draw() method.");
    }
}