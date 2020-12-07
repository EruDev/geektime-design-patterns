package com.erudev.design.structural.bridge;

/**
 * @author pengfei.zhao
 * @date 2020/12/7 20:11
 */
public interface Enchantment {
    void onActivate();
    void apply();
    void onDeactivate();
}
