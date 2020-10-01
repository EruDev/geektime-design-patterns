package com.erudev.design.creational.singleton.lazy;

import com.erudev.design.utils.ConcurrentExecutor;

/**
 * 懒汉式, 双检锁
 * @author pengfei.zhao
 * @date 2020/10/1 15:15
 */
public class LazySingletonDoubleCheck {

    /**
     * 添加 {@code volatile} 解决底层 CPU 指令重排的问题
     */
    public static volatile LazySingletonDoubleCheck INSTANCE = null;

    private LazySingletonDoubleCheck(){}

    public static LazySingletonDoubleCheck getInstance(){
        if (INSTANCE == null){
            synchronized (LazySingletonDoubleCheck.class){
                if (INSTANCE == null){
                    INSTANCE = new LazySingletonDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentExecutor.execute(() -> {
            System.out.println("线程号: " + Thread.currentThread().getName() + "," + LazySingletonDoubleCheck.getInstance());
        }, 10, 5);
    }
}
