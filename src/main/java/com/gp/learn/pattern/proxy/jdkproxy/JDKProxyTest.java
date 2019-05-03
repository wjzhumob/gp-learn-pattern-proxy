package com.gp.learn.pattern.proxy.jdkproxy;

import com.gp.learn.pattern.proxy.Boy;

import java.lang.reflect.Method;

/**
 * @author wjzhu
 * @createDate 2019-05-03 15:49
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        Object obj = new JDKProxy().getInstance(new Boy());
        try {
            Method method = obj.getClass().getMethod("rent",null);
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
