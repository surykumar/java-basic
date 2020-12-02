package com.test.designpattern.abstractfactory.advancetheme;

public interface FactoryProviders<T> {
    T getFactory(String option);
}
