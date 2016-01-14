package com.tom.designpatternssmall.listview_observer;

import java.util.Observable;

/**
 * Created by tom on 2016/1/14.
 */
//AndroidWeekly这个网站是被观察者,它有更新所有的观察者 (这里是程序员) 都会接到相应的通知.
public class AndroidWeekly extends Observable {
    public void postNewPublication(Object content){
        //标示状态或内容发生改变
        setChanged();
        //通知观察者
        notifyObservers(content);
    }
}
