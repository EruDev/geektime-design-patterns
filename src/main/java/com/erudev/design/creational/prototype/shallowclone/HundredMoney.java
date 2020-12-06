package com.erudev.design.creational.prototype.shallowclone;

import com.erudev.design.creational.prototype.Money;
import com.erudev.design.creational.prototype.Shape;
import lombok.*;

/**
 * 一百元 浅拷贝
 *
 * @author pengfei.zhao
 * @date 2020/12/6 15:15
 */
@Getter
@Setter
public class HundredMoney implements Money {
    private Shape shape;

    @Override
    public Money print() {
        HundredMoney hundredMoney = new HundredMoney();
        hundredMoney.setShape(shape);
        return hundredMoney;
    }
}
