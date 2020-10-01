package com.erudev.design.creational.singleton.lazy;

import com.erudev.design.utils.ConcurrentExecutor;

/**
 * 懒汉式, 简单实现
 * @author pengfei.zhao
 * @date 2020/10/1 15:15
 */
public class LazySingletonSimple {

    public static LazySingletonSimple INSTANCE = null;

    private LazySingletonSimple(){}

    public static LazySingletonSimple getInstance(){
        if (INSTANCE == null){
            INSTANCE = new LazySingletonSimple();
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentExecutor.execute(() -> {
            System.out.println("线程号: " + Thread.currentThread().getName() + "," + LazySingletonSimple.getInstance());
        }, 10, 5);
    }
}
