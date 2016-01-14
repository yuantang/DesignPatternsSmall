package com.tom.designpatternssmall.simplefactory;

/**
 * Created by tom on 2016/1/14.
 */

//        模式的定义
//        简单工厂模式又称为静态方法工厂模式，是由一个工厂对象决定创建哪一个产品类的实例。
//        优点和缺点
//        优点：
//        1、分工明确，各司其职；
//        2、客户端不再创建对象，而是把创建对象的职责交给了具体的工厂去创建；
//        3、使抽象与实现分离, 客户程序不知道具体实现；
//        4、具名工厂函数，更能体现出代码含义。
//        缺点：
//        1、工厂的静态方法无法被继承；
//        2、代码维护不易，对象要是很多的话，工厂是一个很庞大的类；
//        3、违反开闭原则，如果有新的产品加入到系统中就要修改工厂类。

//Android源码典型使用场景
//Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher) ;
//点进去可以看bitmap根据传入不同的类型使用不同的方式解析图片


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
