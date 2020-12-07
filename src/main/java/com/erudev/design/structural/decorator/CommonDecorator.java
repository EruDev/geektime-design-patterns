package com.erudev.design.structural.decorator;

/**
 * 套餐 - 装饰器
 *
 * @author pengfei.zhao
 * @date 2020/12/7 20:26
 */
public class CommonDecorator implements KeyBoard {
    private KeyBoard decorated;

    public CommonDecorator(KeyBoard decorated) {
        this.decorated = decorated;
    }

    @Override
    public String getType() {
        return decorated.getType();
    }

    @Override
    public String getMaterial() {
        return decorated.getMaterial();
    }

    @Override
    public Double getPrice() {
        return decorated.getPrice();
    }
}
