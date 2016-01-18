package com.tom.designpatternssmall.factory;

/**
 * Created by tom on 2016/1/18.
 */
public class UbuntuWindThemeFactory extends ThemeFactory {
    @Override
    public WindowStyle createWindowStyle() {
        return new UbuntuWindowStyle();
    }
}
