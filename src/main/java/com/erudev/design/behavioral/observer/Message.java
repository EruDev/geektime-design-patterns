package com.erudev.design.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author pengfei.zhao
 * @date 2020/12/12 13:30
 */
@Data
@AllArgsConstructor
public class Message {
    private String message;
    private String from;
    private String to;
}
