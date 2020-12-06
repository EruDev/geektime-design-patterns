package com.erudev.design.structural.proxy.staticproxy;

import com.erudev.design.structural.proxy.MusicTicket;
import com.erudev.design.structural.proxy.Ticket;
import lombok.Getter;
import lombok.Setter;

/**
 * @author pengfei.zhao
 * @date 2020/12/6 15:58
 */
@Getter
@Setter
public class MusicConductor implements Ticket {
    private MusicTicket musicTicket;

    public MusicConductor(MusicTicket musicTicket) {
        this.musicTicket = musicTicket;
    }

    @Override
    public void sell() {
        before();
        musicTicket.sell();
        after();
    }

    public void before() {
        System.out.println("静态代理增强之前...");
    }

    public void after() {
        System.out.println("静态代理增强之后...");
    }
}
