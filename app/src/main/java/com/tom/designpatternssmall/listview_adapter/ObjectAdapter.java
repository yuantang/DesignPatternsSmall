package com.tom.designpatternssmall.listview_adapter;

/**
 * Created by tom on 2016/1/18.
 */
public class ObjectAdapter implements FiveVolt {
    Volt220 mVolt220;
    @Override
    public int getVolt5() {
        return 5;
    }
    public  ObjectAdapter(Volt220 adaptee){
        mVolt220=adaptee;
    }
    public int getVolt220(){
        return mVolt220.getVolt220();
    }

}
