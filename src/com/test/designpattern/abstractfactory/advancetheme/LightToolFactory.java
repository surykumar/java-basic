package com.test.designpattern.abstractfactory.advancetheme;

public interface LightToolFactory<T> {
    T create(String type);
}
