package com.tom.designpatternssmall.abstractfactory;

/**
 *具体工厂, 创建各种应用, 这里为文本编辑器和图像编辑器.
 */
public class MacAppFactory extends AppFactory {
    @Override
    public TextEditor createTextEditor() {
        return new MacTextEditor();
    }
    @Override
    public ImageEditor createImageEditor() {
        return new MacImageEditor();
    }
}
