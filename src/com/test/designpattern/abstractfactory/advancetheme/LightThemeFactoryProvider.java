package com.test.designpattern.abstractfactory.advancetheme;

public class LightThemeFactoryProvider implements FactoryProviders<LightToolFactory>{

    @Override
    public LightToolFactory getFactory(String tool){
        if("Dialog".equals(tool)){
            return new LightDialogFactory();
        }
        else if("Toolbar".equals(tool)){
            return new LightToolBarFactory();
        }
        else {
            return null;
        }
    }
}
