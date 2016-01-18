package com.tom.designpatternssmall.factory;

/**
 * 工厂类, 对应Factory角色
 */
public abstract class ThemeFactory {
    public abstract  WindowStyle createWindowStyle();
}
