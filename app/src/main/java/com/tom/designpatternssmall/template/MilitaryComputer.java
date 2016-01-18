package com.tom.designpatternssmall.template;

/**
 * Created by tom on 2016/1/18.
 */
public class MilitaryComputer extends AbstractComputer {
    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查硬件防火墙");
    }
    @Override
    protected void login() {
        System.out.println("进行指纹之别等复杂的用户验证");
    }
}
