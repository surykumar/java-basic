package com.test.designpattern.abstractfactory.theme;

public class DarkThemeFactory implements ThemeFactory {

    @Override
    public Dialog createDialog() {
        return new DarkDialog();
    }

    @Override
    public ToolBar createToolBar() {
        return new DarkToolBar();
    }
}
