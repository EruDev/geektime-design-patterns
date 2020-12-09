package com.erudev.design.behavioral.strategy.payment;

/**
 * @author pengfei.zhao
 * @date 2020/12/9 20:38
 */
public class WechatPayment implements Payment {
    @Override
    public String channelName() {
        return "微信支付";
    }

    @Override
    public double balance() {
        return 10;
    }

    @Override
    public void pay(double money) {
        if (money > balance()) {
            System.err.println("余额不足, 余额:" + money);
        } else {
            System.out.println("交易成功");
        }
    }
}
