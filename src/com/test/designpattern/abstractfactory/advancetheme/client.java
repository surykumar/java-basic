package com.test.designpattern.abstractfactory.advancetheme;

public class client {
    public static void main(String[] args) {
        FactoryProviders darkFactoryProviders = ThemeFactoryProviders.getProviders("Dark");
        DarkToolFactory darkToolFactory = (DarkToolFactory) darkFactoryProviders.getFactory("Dialog");
        DarkDialog darkDialogA = (DarkDialog) darkToolFactory.create("A");
        DarkDialog darkDialogB = (DarkDialog) darkToolFactory.create("B");
        darkDialogA.get();
        darkDialogB.get();

        FactoryProviders lightFactoryProviders = ThemeFactoryProviders.getProviders("Light");
        LightToolFactory lightToolFactory = (LightToolFactory) lightFactoryProviders.getFactory("Toolbar");
        LightToolBar lightToolBarA = (LightToolBar) lightToolFactory.create("A");
        LightToolBar lightToolBarB = (LightToolBar) lightToolFactory.create("B");
        lightToolBarA.get();
        lightToolBarB.get();
    }
}
