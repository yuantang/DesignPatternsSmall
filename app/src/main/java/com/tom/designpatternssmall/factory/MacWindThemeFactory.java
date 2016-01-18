package com.tom.designpatternssmall.factory;

/**
 * Created by tom on 2016/1/18.
 */
public class MacWindThemeFactory extends ThemeFactory {
    @Override
    public WindowStyle createWindowStyle() {
        return new MacWindowStyle();
    }
}
