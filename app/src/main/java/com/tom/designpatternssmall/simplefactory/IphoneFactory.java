package com.tom.designpatternssmall.simplefactory;

/**
 * Created by tom on 2016/1/14.
 */

/**
 * iPhone手机工厂
 */
public class IphoneFactory {

    public static Iphone createIphone(String type){
        if (type==null){
            return null;
        }
        Iphone iphone=null;
        if (type.equals("iphone6")){
            iphone=new Iphone6();
        }else if(type.equals("iphone6s")){
            iphone=new Iphone6s();
        }
        return iphone;
    }
}
