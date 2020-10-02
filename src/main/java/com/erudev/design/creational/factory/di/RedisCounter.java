package com.erudev.design.creational.factory.di;

/**
 * @author pengfei.zhao
 * @date 2020/10/1 19:24
 */
public class RedisCounter {
    private String ipAddress;
    private String port;

    public RedisCounter(String ipAddress, String port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public int incrementAndGet(){
        System.out.println("Connect to " + this.ipAddress + ":" + this.port);
        return 10;
    }
}
