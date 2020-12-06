package com.erudev.design.structural.proxy.dynamicproxy;

import com.erudev.design.structural.proxy.Ticket;

/**
 * @author pengfei.zhao
 * @date 2020/12/6 16:03
 */
public class SportTicket implements Ticket {
    @Override
    public void sell() {
        System.out.println("运动会门票");
    }
}
