package com.erudev.design.structural.adapter;

/**
 * @author pengfei.zhao
 * @date 2020/12/7 20:04
 */
public class PatternTest {
    public static void main(String[] args) {
        TypeCAdapter adapter = new TypeCAdapter(new Usb());
        adapter.slot();
    }
}
