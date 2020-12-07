package com.erudev.design.structural.decorator;

/**
 * 键盘
 *
 * @author pengfei.zhao
 * @date 2020/12/7 20:20
 */
public interface KeyBoard {

    /**
     * 类型（多少键的）
     * @return 类型
     */
    String getType();

    /**
     * 材质
     * @return 材质
     */
    String getMaterial();

    /**
     * 价格
     * @return 价格
     */
    Double getPrice();
}
