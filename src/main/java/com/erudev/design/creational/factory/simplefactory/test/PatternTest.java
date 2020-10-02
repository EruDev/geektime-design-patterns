package com.erudev.design.creational.factory.simplefactory.test;

import com.erudev.design.creational.factory.simplefactory.GenJi;
import com.erudev.design.creational.factory.simplefactory.GrimReaper;
import com.erudev.design.creational.factory.simplefactory.Hero;
import com.erudev.design.creational.factory.simplefactory.HeroFactory;

/**
 * @author pengfei.zhao
 * @date 2020/10/2 9:09
 */
public class PatternTest {
    public static void main(String[] args) {
        HeroFactory factory = new HeroFactory();
        Hero genji = factory.produce("genji");
        genji.Q();
        Hero grimreaper = factory.produce("grimreaper");
        grimreaper.Q();

        Hero genji2 = factory.produce(GenJi.class);
        genji.Q();
        Hero grimreaper2 = factory.produce(GrimReaper.class);
        grimreaper.Q();
    }
}
