package com.tom.designpatternssmall.Builder;

/**
 * Created by tom on 2016/1/15.
 */
public class Director {
    Builder mBuilder=null;

    /**
     *
     * @param builder
     */
    public  Director(Builder builder){
        mBuilder=builder;
    }

    /**
     * 构建对象
     *
     * @param cpu
     * @param ram
     * @param os
     */
    public void construct(int cpu, int ram, String os) {
        mBuilder.buildCPU(cpu);
        mBuilder.buildRAM(ram);
        mBuilder.buildOs(os);
    }
}
