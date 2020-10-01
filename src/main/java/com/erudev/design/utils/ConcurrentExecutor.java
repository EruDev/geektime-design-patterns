package com.erudev.design.utils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author pengfei.zhao
 * @date 2020/10/1 14:56
 */
public class ConcurrentExecutor {

    public static void execute(Runhandler runhandler, int requestCount, int concurrentCount) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        Semaphore semaphore = new Semaphore(concurrentCount);
        CountDownLatch countDownLatch = new CountDownLatch(requestCount);

        for (int i = 0; i < requestCount; i++) {
            service.execute(() -> {
                try {
                    // 获取信号量
                    semaphore.acquire();
                    // 执行操作
                    runhandler.handler();
                    // 释放信号量
                    semaphore.release();

                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }finally {
                    countDownLatch.countDown();
                }
            });
        }
        // 阻塞主线程
        countDownLatch.await();
        service.shutdown();
    }

    public interface Runhandler{
        void handler();
    }
}
