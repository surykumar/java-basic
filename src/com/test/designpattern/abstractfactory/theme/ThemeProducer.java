package com.test.designpattern.abstractfactory.theme;

public class ThemeProducer {
    public ThemeFactory getFactory(String choice){
        if("Dark".equals(choice)){
            return new DarkThemeFactory();
        } else if("Light".equals(choice)) {
            return new LightThemeFactory();
        }
        return null;
    }
}
