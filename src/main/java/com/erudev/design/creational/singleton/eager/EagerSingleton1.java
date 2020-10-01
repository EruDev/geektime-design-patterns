package com.erudev.design.creational.singleton.eager;

import com.erudev.design.utils.ConcurrentExecutor;

/**
 * 饿汉式, 在属性初始化
 * @author pengfei.zhao
 * @date 2020/10/1 8:03
 */
public class EagerSingleton1 {

    public static final EagerSingleton1 INSTANCE = new EagerSingleton1();

    private EagerSingleton1(){
    }

    public static EagerSingleton1 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentExecutor.execute(new ConcurrentExecutor.Runhandler() {
            @Override
            public void handler() {
                System.out.println("线程号: " + Thread.currentThread().getName() + "，" + EagerSingleton1.getInstance());
            }
        }, 10, 5);
    }
}
