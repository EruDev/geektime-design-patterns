package com.erudev.design.structural.decorator;

/**
 * @author pengfei.zhao
 * @date 2020/12/7 20:29
 */
public class MechanicalKeyBoard extends CommonDecorator{

    public MechanicalKeyBoard(KeyBoard decorated) {
        super(decorated);
    }

    @Override
    public String getType() {
        return super.getType() + "升级到67键";
    }

    @Override
    public String getMaterial() {
        return super.getMaterial() + "升级到PBT材质";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 188;
    }
}
