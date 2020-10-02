package com.erudev.design.creational.factory.simplefactory;

/**
 * @author pengfei.zhao
 * @date 2020/10/2 9:03
 */
public class HeroFactory {

    /**
     * 根据不同的大招(q) 生产不同的英雄
     * @param q 大招
     * @return hero
     */
    public Hero produce(String q){
        switch (q){
            case "genji":
                return new GenJi();
            case "grimreaper":
                return new GrimReaper();
            default:
                return null;
        }
    }

    /**
     * 根据传入不同的英雄类型 创建不同的英雄
     * @param q 英雄类型
     * @return hero
     */
    public Hero produce(Class q){
        Hero hero = null;
        try {
            hero = (Hero) Class.forName(q.getSimpleName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return hero;
    }
}
