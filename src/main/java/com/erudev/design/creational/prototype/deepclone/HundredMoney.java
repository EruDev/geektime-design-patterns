package com.erudev.design.creational.prototype.deepclone;

import com.erudev.design.creational.prototype.Money;
import com.erudev.design.creational.prototype.Shape;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.io.*;

/**
 * 一百元 深拷贝
 *
 * @author pengfei.zhao
 * @date 2020/12/6 15:24
 */
@Getter
@Setter
public class HundredMoney implements Money, Cloneable, Serializable {

    private static final long serialVersionUID = 4237220523167245166L;

    private Shape shape;

    @Override
    public Money print() {
        return (HundredMoney) clone();
    }

    @Override
    protected Object clone() {
        return deepClone();
    }

    @SneakyThrows
    private Object deepClone() {
        @Cleanup ByteArrayOutputStream bos = new ByteArrayOutputStream();
        @Cleanup ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        @Cleanup ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        @Cleanup ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
