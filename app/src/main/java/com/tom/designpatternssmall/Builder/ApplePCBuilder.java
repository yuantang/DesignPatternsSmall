package com.tom.designpatternssmall.Builder;

/**
 * Created by tom on 2016/1/15.
 */
public class ApplePCBuilder extends Builder {
    Computer mApplePc=new AppleComputer();

    @Override
    public void buildCPU(int core) {
        mApplePc.setCPU(core);
    }

    @Override
    public void buildRAM(int gb) {
        mApplePc.setRAM(gb);
    }

    @Override
    public void buildOs(String os) {
        mApplePc.setOS(os);
    }

    @Override
    public Computer create() {
        return mApplePc;
    }
}
