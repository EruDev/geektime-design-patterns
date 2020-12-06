package com.erudev.design.creational.prototype.shallowclone.run;

import com.erudev.design.creational.prototype.Shape;
import com.erudev.design.creational.prototype.shallowclone.HundredMoney;

/**
 * @author pengfei.zhao
 * @date 2020/12/6 15:20
 */
public class HundredMoneyTest {
    public static void main(String[] args) {
        HundredMoney money = new HundredMoney();
        money.setShape(new Shape("纸币"));

        HundredMoney money2 = (HundredMoney)money.print();
        System.out.println("money1 -> 对象引用地址:" + money.getShape());
        System.out.println("money2 -> 对象引用地址:" + money2.getShape());
        System.out.println("对象引用地址比较:" + (money2.getShape() == money.getShape()));
    }
}
