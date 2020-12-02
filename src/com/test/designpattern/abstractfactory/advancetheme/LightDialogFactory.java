package com.test.designpattern.abstractfactory.advancetheme;

public class LightDialogFactory implements LightToolFactory {

    @Override
    public LightDialog create(String type) {
        if("A".equals(type)){
            return new LightDialogA();
        }
        else {
            return new LightDialogB();
        }
    }
}
