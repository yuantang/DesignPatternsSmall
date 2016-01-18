package com.tom.designpatternssmall.abstractfactory;

import android.util.Log;

/**
 * Created by tom on 2016/1/18.
 */
public class MacImageEditor extends ImageEditor {
    private static final String TAG ="MacImageEditor" ;

    @Override
    public void edit(String text) {
        Log.d(TAG,"MacImageEditor------------>"+text);
    }
    @Override
    public void save() {
        Log.d(TAG,"MacImageEditor------------>save");
    }
}
