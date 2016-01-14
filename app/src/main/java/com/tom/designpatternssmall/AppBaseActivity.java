package com.tom.designpatternssmall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by tom on 2016/1/14.
 */
public abstract class AppBaseActivity  extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

//    public abstract void initView(Bundle savedInstanceState);
//    public  abstract void initData();
}
