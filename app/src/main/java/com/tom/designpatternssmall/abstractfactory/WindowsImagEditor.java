package com.tom.designpatternssmall.abstractfactory;

import android.util.Log;

/**
 * Created by tom on 2016/1/18.
 */
public class WindowsImagEditor extends ImageEditor {
    private static final String TAG ="WindowsImagEditor" ;

    @Override
    public void edit(String text) {
        Log.d(TAG,text);
    }

    @Override
    public void save() {
        Log.d(TAG,"Windows ImageEditor------------>save");

    }
}
