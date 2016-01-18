package com.tom.designpatternssmall.template;

/**
 * Created by tom on 2016/1/18.
 *
 * 码农的电脑
 */
public class CoderComputer extends AbstractComputer{

    @Override
    protected void login() {
        System.out.println("码农只需要进行用户和密码验证就可以了");
    }
}
