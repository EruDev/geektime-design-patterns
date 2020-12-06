package com.erudev.design.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理
 * 什么门票都卖
 *
 * @author pengfei.zhao
 * @date 2020/12/6 16:03
 */
public class Conductor implements InvocationHandler {
    /**
     * 被代理的对象
     */
    private Object target;


    public Object getInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                this.target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // 被代理后的对象
        Object obj = method.invoke(target, args);
        after();
        return obj;
    }

    public void before() {
        System.out.println("JDK 动态代理 动态代理之前");
    }

    public void after() {
        System.out.println("JDK 动态代理 动态代理之后");
    }
}
