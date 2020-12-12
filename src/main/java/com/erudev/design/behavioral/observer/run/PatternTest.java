package com.erudev.design.behavioral.observer.run;

import com.erudev.design.behavioral.observer.Message;
import com.erudev.design.behavioral.observer.Pusher;
import com.erudev.design.behavioral.observer.User;

/**
 * @author pengfei.zhao
 * @date 2020/12/12 13:38
 */
public class PatternTest {
    public static void main(String[] args) {
        User erudev = new User("erudev");
        Pusher pusher = Pusher.getInstance();
        Message message = new Message("你好", "user-1", "erudev");
        pusher.addObserver(erudev);
        pusher.pushMessage(message);
    }
}
