package com.gp.learn.pattern.proxy;

/**
 * @author wjzhu
 * @createDate 2019-05-03 15:41
 */
public class Boy implements Landlord {

    @Override
    public void rent() {
        System.out.println("男孩出租房子！");
    }
}
