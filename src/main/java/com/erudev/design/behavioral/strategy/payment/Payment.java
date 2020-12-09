package com.erudev.design.behavioral.strategy.payment;

/**
 * @author pengfei.zhao
 * @date 2020/12/9 20:35
 */
public interface Payment {

    String channelName();

    double balance();

    void pay(double money);
}
