package com.test.designpattern.abstractfactory.advancetheme;

public class LightDialogA implements LightDialog {
    @Override
    public void get() {
        System.out.println("Generating Light Dialog-A");
    }
}
