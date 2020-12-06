package com.erudev.design.structural.proxy;

/**
 * @author pengfei.zhao
 * @date 2020/12/6 15:57
 */
public class MusicTicket implements Ticket{
    @Override
    public void sell() {
        System.out.println("演唱会门票");
    }
}
