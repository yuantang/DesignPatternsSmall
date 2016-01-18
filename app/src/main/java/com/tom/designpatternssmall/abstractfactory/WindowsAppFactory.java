package com.tom.designpatternssmall.abstractfactory;

/**
 * Created by tom on 2016/1/18.
 */
public class WindowsAppFactory extends AppFactory {
    @Override
    public TextEditor createTextEditor() {
        return new WindowsTextEditor();
    }

    @Override
    public ImageEditor createImageEditor() {
        return new WindowsImagEditor();
    }
}
