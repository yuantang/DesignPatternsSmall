package com.tom.designpatternssmall.template;

/**
 * Created by tom on 2016/1/18.
 */
public abstract class AbstractComputer {
    protected void powerOn(){
        System.out.println("开启电源");
    };
    protected  void  checkHardware(){
        System.out.println("硬件检查");
    }
    protected void loadOs(){
        System.out.println("系统载入");
    }
    protected void login(){
        System.out.println("小白电脑无需验证，直接进入系统");
    }

    public final  void startUp(){

        System.out.println("-----------------------开机 start--------------------------------");
        powerOn();
        checkHardware();
        loadOs();
        login();
        System.out.println("-----------------------关机 stop--------------------------------");
    }
}
