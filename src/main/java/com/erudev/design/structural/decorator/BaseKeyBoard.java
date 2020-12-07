package com.erudev.design.structural.decorator;

/**
 * 普通键盘
 *
 * @author pengfei.zhao
 * @date 2020/12/7 20:25
 */
public class BaseKeyBoard implements KeyBoard{
    @Override
    public String getType() {
        return "104键";
    }

    @Override
    public String getMaterial() {
        return "塑料";
    }

    @Override
    public Double getPrice() {
        return 66.66;
    }
}
