package com.test.designpattern.abstractfactory.advancetheme;

public class ThemeFactoryProviders {
    public static FactoryProviders getProviders(String option) {
        if("Dark".equals(option)){
            return new DarkThemeFactoryProvider();
        }
        else {
            return new LightThemeFactoryProvider();
        }
    }
}
