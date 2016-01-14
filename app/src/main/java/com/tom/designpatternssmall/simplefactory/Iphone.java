package com.tom.designpatternssmall.simplefactory;

/**
 * Created by tom on 2016/1/14.
 */
public interface Iphone {
    /**
     * 打电话功能
     */
    public void call();

    /**
     * 发短信功能
     */
    public void sendMessage();

    /**
     * 上网功能
     */
    public void surfTheInternet();
    /**
     * 拍照
     */
    public void takePicture();
}
