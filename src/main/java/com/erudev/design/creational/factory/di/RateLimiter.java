package com.erudev.design.creational.factory.di;

/**
 * @author pengfei.zhao
 * @date 2020/10/1 19:26
 */
public class RateLimiter {
    private RedisCounter redisCounter;

    public RateLimiter(RedisCounter redisCounter) {
        this.redisCounter = redisCounter;
    }

    public boolean isValid(){
        this.redisCounter.incrementAndGet();
        return true;
    }
}
