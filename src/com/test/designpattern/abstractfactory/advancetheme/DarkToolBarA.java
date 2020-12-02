package com.test.designpattern.abstractfactory.advancetheme;

public class DarkToolBarA implements DarkToolBar {
    @Override
    public void get() {
        System.out.println("Generating Dark toolbar-A");
    }
}
