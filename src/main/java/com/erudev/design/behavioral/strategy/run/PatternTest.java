package com.erudev.design.behavioral.strategy.run;

import com.erudev.design.behavioral.strategy.PaymentStrategy;
import com.erudev.design.behavioral.strategy.payment.Payment;

/**
 * @author pengfei.zhao
 * @date 2020/12/9 20:41
 */
public class PatternTest {
    public static void main(String[] args) {
        Payment aliPay = PaymentStrategy.chose(PaymentStrategy.ALI_PAY);
        aliPay.pay(300);

        System.out.println("----------------");

        Payment wechatPay = PaymentStrategy.chose(PaymentStrategy.WECHAT_PAY);
        wechatPay.pay(100);
    }
}
