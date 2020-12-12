package com.erudev.design.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * @author pengfei.zhao
 * @date 2020/12/12 13:31
 */
@Data
@AllArgsConstructor
public class User implements Observer {
    private String name;

    /**
     * 被观察对象改变的时候, 会触发这个方法
     *
     * @param o   the observable object.
     * @param arg notifyObservers
     */
    @Override
    public void update(Observable o, Object arg) {
        Message message = (Message) arg;
        if (getName().equals(message.getTo())) {
            System.err.println(name + ", 你收到来自 " + message.getFrom() + "的私信");
            System.err.println("私信内容: " + message.getMessage());
        }
    }
}
