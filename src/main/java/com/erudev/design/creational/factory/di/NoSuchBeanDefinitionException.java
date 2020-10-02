package com.erudev.design.creational.factory.di;

/**
 * @author pengfei.zhao
 * @date 2020/10/1 19:23
 */
public class NoSuchBeanDefinitionException extends RuntimeException{
    public NoSuchBeanDefinitionException(String message) {
        super(message);
    }
}
