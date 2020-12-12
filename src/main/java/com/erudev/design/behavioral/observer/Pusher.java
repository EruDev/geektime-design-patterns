package com.erudev.design.behavioral.observer;

import java.util.Observable;

/**
 * 消息推送被观察者
 *
 * @author pengfei.zhao
 * @date 2020/12/12 13:35
 */
public class Pusher extends Observable {
    private static Pusher PUSHER = null;

    private Pusher() {

    }

    public static Pusher getInstance() {
        if (PUSHER == null) {
            PUSHER = new Pusher();
        }
        return PUSHER;
    }

    public void pushMessage(Message message) {
        System.out.println(message.getFrom() + " 向 " + message.getTo() + " 发送了一条消息");
        // 触发状态
        setChanged();
        // 提醒被观察者
        notifyObservers(message);
    }
}
