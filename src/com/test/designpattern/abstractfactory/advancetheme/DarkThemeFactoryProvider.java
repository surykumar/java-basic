package com.test.designpattern.abstractfactory.advancetheme;

public class DarkThemeFactoryProvider implements FactoryProviders<DarkToolFactory> {

    @Override
    public DarkToolFactory getFactory(String tool){
        if("Dialog".equals(tool)) {
            return new DarkDialogFactory();
        }
        else if ("Toolbar".equals(tool)) {
            return new DarkToolBarFactory();
        }
        return null;
    }
}
