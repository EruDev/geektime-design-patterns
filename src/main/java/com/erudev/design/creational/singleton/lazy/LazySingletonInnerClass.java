package com.erudev.design.creational.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式, 静态内部类 推荐写法之一
 * @author pengfei.zhao
 * @date 2020/10/1 15:23
 */
public class LazySingletonInnerClass {

    private LazySingletonInnerClass(){
        // 反射获取类的构造方法, 通过 newInstance() 获取对象会存在单例被破坏的问题
        // 强制不允许创建
        if (SingletonHolder.INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static class SingletonHolder {
        private final static LazySingletonInnerClass INSTANCE = new LazySingletonInnerClass();
    }

    public static LazySingletonInnerClass getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazySingletonInnerClass instance1 = LazySingletonInnerClass.getInstance();

        Class<LazySingletonInnerClass> clazz = LazySingletonInnerClass.class;
        Constructor<LazySingletonInnerClass> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        LazySingletonInnerClass instance2 = constructor.newInstance();

        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
    }
}
