package com.tom.designpatternssmall.factory;

import android.util.Log;

/**
 * Created by tom on 2016/1/18.
 */
public class UbuntuWindowStyle extends WindowStyle {
    private static final String TAG ="UbuntuWindowStyle" ;

    @Override
    public void useStyle() {

    }

    @Override
    public void useStyle(String type) {
        Log.d(TAG,type);
    }
}
