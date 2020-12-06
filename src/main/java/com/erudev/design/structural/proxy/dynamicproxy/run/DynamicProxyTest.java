package com.erudev.design.structural.proxy.dynamicproxy.run;

import com.erudev.design.structural.proxy.MusicTicket;
import com.erudev.design.structural.proxy.Ticket;
import com.erudev.design.structural.proxy.dynamicproxy.Conductor;
import com.erudev.design.structural.proxy.dynamicproxy.SportTicket;

/**
 * @author pengfei.zhao
 * @date 2020/12/6 16:06
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Ticket sportTicket = (Ticket) new Conductor().getInstance(new SportTicket());
        sportTicket.sell();
        Ticket musicTicket = (Ticket) new Conductor().getInstance(new MusicTicket());
        musicTicket.sell();
    }
}
