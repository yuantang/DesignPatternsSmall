package com.tom.designpatternssmall.Builder;

/**
 * Created by tom on 2016/1/15.
 */
public abstract class Computer {
    protected int mCupCount=1;
    protected int mRamSize=0;
    protected String mOs="windows";

    public Computer(){

    }
    public abstract void setCPU(int core);
    public abstract void setRAM(int gb);
    public abstract void setOS(String os);

    @Override
    public String toString() {
        return "Computer [mCpuCore=" + mCupCount + ", mRamSize=" + mRamSize
                + ", mOs=" + mOs + "]";
    }
}
