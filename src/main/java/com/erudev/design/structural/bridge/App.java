package com.erudev.design.structural.bridge;


/**
 * @author pengfei.zhao
 * @date 2020/12/7 20:16
 */
public class App {
    public static void main(String[] args) {
        var enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        var hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
