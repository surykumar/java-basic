package com.test.designpattern.abstractfactory.advancetheme;

public class LightToolBarFactory implements LightToolFactory {
    @Override
    public LightToolBar create(String type) {
        if("A".equals(type)){
            return new LightToolBarA();
        }
        else {
            return new LightToolBarB();
        }
    }
}
