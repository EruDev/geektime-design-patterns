package com.erudev.design.structural.proxy.staticproxy.run;

import com.erudev.design.structural.proxy.MusicTicket;
import com.erudev.design.structural.proxy.staticproxy.MusicConductor;

/**
 * @author pengfei.zhao
 * @date 2020/12/6 15:59
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        MusicConductor musicConductor = new MusicConductor(new MusicTicket());
        musicConductor.sell();
    }
}
