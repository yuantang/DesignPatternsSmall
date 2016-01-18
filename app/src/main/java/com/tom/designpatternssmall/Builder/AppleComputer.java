package com.tom.designpatternssmall.Builder;

/**
 * Created by tom on 2016/1/15.
 */
public class AppleComputer extends Computer {

    public AppleComputer(){

    }
    @Override
    public void setCPU(int core) {
        mCupCount=core;
    }

    @Override
    public void setRAM(int gb) {
        mRamSize=gb;
    }

    @Override
    public void setOS(String os) {
        mOs=os;
    }
}
