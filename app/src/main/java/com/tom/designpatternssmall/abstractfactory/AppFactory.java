package com.tom.designpatternssmall.abstractfactory;

/**
 * 应用软件工厂
 */
public abstract class AppFactory {
    public abstract TextEditor createTextEditor();
    public abstract ImageEditor createImageEditor();
}
