package com.erudev.design.creational.factory.di;

/**
 * @author pengfei.zhao
 * @date 2020/10/1 19:21
 */
public interface ApplicationContext {
    Object getBean(String beanId);
}
