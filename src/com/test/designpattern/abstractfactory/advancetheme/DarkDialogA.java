package com.test.designpattern.abstractfactory.advancetheme;

public class DarkDialogA implements DarkDialog {

    @Override
    public void get() {
        System.out.println("Generating Dark Dialog-A");
    }
}
