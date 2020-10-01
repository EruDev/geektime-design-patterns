package com.erudev.design.creational.singleton.eager;

import com.erudev.design.utils.ConcurrentExecutor;

/**
 * 饿汉式, 在静态代码块初始化
 * @author pengfei.zhao
 * @date 2020/10/1 15:07
 */
public class EagerSingleton2 {
    public static EagerSingleton2 INSTANCE = null;

    static {
        INSTANCE = new EagerSingleton2();
    }

    private EagerSingleton2(){}

    public static EagerSingleton2 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentExecutor.execute(new ConcurrentExecutor.Runhandler() {
            @Override
            public void handler() {
                System.out.println("线程号：" + Thread.currentThread().getName() + ", " + EagerSingleton2.getInstance());
            }
        }, 10, 5);
    }
}
