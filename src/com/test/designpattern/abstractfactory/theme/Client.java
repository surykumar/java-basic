package com.test.designpattern.abstractfactory.theme;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPathFactory;

public class Client {
    public static void main(String[] args) {
        ThemeProducer themeProducer = new ThemeProducer();
        ThemeFactory darkTheme = themeProducer.getFactory("Dark");
        Dialog darkThemeDialog = darkTheme.createDialog();
        ToolBar darkThemeToolBar = darkTheme.createToolBar();
        darkThemeDialog.get();
        darkThemeToolBar.get();

        ThemeFactory lightTheme = themeProducer.getFactory("Light");
        Dialog lightThemeDialog = lightTheme.createDialog();
        ToolBar lightThemeToolBar = lightTheme.createToolBar();
        lightThemeDialog.get();
        lightThemeToolBar.get();

        // Real life example jdk -
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            TransformerFactory transFactory = TransformerFactory.newInstance();

            XPathFactory xpathFactory = XPathFactory.newInstance();




    }
}
