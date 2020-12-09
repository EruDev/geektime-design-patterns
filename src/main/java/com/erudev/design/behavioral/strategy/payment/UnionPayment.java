package com.erudev.design.behavioral.strategy.payment;

/**
 * @author pengfei.zhao
 * @date 2020/12/9 20:39
 */
public class UnionPayment implements Payment{
    @Override
    public String channelName() {
        return "银联支付";
    }

    @Override
    public double balance() {
        return 20;
    }

    @Override
    public void pay(double money) {
        if (money > balance()) {
            System.err.println("余额不足，当前余额：" + balance());
        } else {
            System.out.println("支付成功, 交易金额:" + money);
        }
    }
}
