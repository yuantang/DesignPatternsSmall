package com.tom.designpatternssmall.listview_observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by tom on 2016/1/14.
 */

//程序员是观察者,也可以说是订阅者
public class Coder implements Observer {
    private static final String TAG ="Coder" ;
    String coderName;

    public Coder(String name){
        this.coderName=name;
    }

    @Override
    public void update(Observable observable, Object data) {
        Log.d(TAG,"hi！"+coderName+":AndroidWeekly更新啦，内容"+data);
    }

    @Override
    public String toString() {
        return "码农："+coderName;
    }
}
