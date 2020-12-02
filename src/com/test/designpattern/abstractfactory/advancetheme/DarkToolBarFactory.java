package com.test.designpattern.abstractfactory.advancetheme;

public class DarkToolBarFactory implements DarkToolFactory {

    @Override
    public DarkToolBar create(String type) {
        if("A".equals(type)){
            return new DarkToolBarA();
        }
        else {
            return new DarkToolBarB();
        }
    }
}
