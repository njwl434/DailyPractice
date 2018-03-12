package com.wl.dailypractice.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @describe: DailyPractice
 * @author: 武梁
 * @date: 2018/3/12 13:59
 * @mailbox: 1034905058@qq.com
 */

public class UserJdkProxy implements InvocationHandler {
    private Object ma;

    /**
     * 绑定一个委托对象 返回一个代理类
     * @param ma
     * @return
     */
    public Object bind(Object ma){
        this.ma=ma;
        return Proxy.newProxyInstance(ma.getClass().getClassLoader(),ma.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object ms=method.invoke(ma,objects);
        return ms;
    }
}
