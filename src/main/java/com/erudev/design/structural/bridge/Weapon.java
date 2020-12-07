package com.erudev.design.structural.bridge;

/**
 * @author pengfei.zhao
 * @date 2020/12/7 20:13
 */
public interface Weapon {
    void wield();
    void swing();
    void unwield();
    Enchantment getEnchantment();
}
