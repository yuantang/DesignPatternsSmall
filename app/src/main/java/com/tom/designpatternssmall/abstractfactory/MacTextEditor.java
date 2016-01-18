package com.tom.designpatternssmall.abstractfactory;

import android.util.Log;

/**
 * Created by tom on 2016/1/18.
 */
public class MacTextEditor extends TextEditor {
    private static final String TAG ="MacTextEditor" ;



    @Override
    public void edit(String text) {
        Log.d(TAG,"MacTextEditor------------->"+text);

    }

    @Override
    public void save() {
        Log.d(TAG,"MacTextEditor--------------->save");
    }
}
