package com.test.designpattern.abstractfactory.advancetheme;

public interface DarkToolFactory<T> {
    T create(String type);
}
