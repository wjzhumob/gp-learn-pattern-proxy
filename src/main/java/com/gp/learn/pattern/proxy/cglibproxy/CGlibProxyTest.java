package com.gp.learn.pattern.proxy.cglibproxy;

import com.gp.learn.pattern.proxy.Boy;

/**
 * @author wjzhu
 * @createDate 2019-05-03 16:17
 */
public class CGlibProxyTest {
    public static void main(String[] args) {
        Boy boy = (Boy)new CGlibProxy().getInstance(Boy.class);
        boy.rent();
    }
}
