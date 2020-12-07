package com.erudev.design.structural.adapter;

import java.io.Serializable;

/**
 * USB 接口
 *
 * @author pengfei.zhao
 * @date 2020/12/7 19:53
 */
public class Usb implements Serializable {

    public String slot() {
        String type = "USB";
        System.out.println("接口类型: " + type);
        return type;
    }
}
