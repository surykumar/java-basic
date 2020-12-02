package com.test.designpattern.abstractfactory.theme;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Dialog createDialog() {
        return new LightDialog();
    }

    @Override
    public ToolBar createToolBar() {
        return new LightToolBar();
    }
}
