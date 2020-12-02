package com.test.designpattern.abstractfactory.advancetheme;

public class DarkDialogFactory implements DarkToolFactory {

    @Override
    public DarkDialog create(String type) {
        if("A".equals(type)){
            return new DarkDialogA();
        }
        else {
            return new DarkDialogB();
        }
    }
}
