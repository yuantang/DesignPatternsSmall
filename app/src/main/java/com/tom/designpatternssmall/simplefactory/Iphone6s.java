package com.tom.designpatternssmall.simplefactory;

import android.util.Log;

/**
 * Created by tom on 2016/1/14.
 */
public class Iphone6s implements Iphone {
    private static final String TAG ="Iphone6s" ;

    @Override
    public void call() {
        Log.d(TAG,"Iphone6s 打电话");
    }

    @Override
    public void sendMessage() {
        Log.d(TAG,"Iphone6s 发短信");
    }

    @Override
    public void surfTheInternet() {
        Log.d(TAG,"Iphone6s 上网");
    }

    @Override
    public void takePicture() {
        Log.d(TAG,"Iphone6s 拍照");
    }
}
