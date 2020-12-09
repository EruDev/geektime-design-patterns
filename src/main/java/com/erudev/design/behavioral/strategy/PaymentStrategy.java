package com.erudev.design.behavioral.strategy;

import com.erudev.design.behavioral.strategy.payment.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付策略
 *
 * @author pengfei.zhao
 * @date 2020/12/9 20:32
 */
public enum PaymentStrategy {
    ALI_PAY,
    WECHAT_PAY,
    JD_PAY,
    UNION_PAY;

    public static Map<PaymentStrategy, Payment> PAYMENT_POOL = new HashMap<>();

    static {
        PAYMENT_POOL.put(ALI_PAY, new AliPayment());
        PAYMENT_POOL.put(WECHAT_PAY, new WechatPayment());
        PAYMENT_POOL.put(JD_PAY, new JdPayment());
        PAYMENT_POOL.put(UNION_PAY, new UnionPayment());
    }


    public static Payment chose(PaymentStrategy strategy) {
        Payment payment = PAYMENT_POOL.get(strategy);
        if (PAYMENT_POOL.containsKey(payment)) {
            payment = PAYMENT_POOL.get(strategy);
        }

        System.out.println("欢迎使用: " + payment.channelName());
        return payment;
    }
}
