package com.basic.a05_thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorsDemo {
    public static void main(String[] args) {

        /*
        参数1：核心线程数量: 不能 <0
        参数2：最大线程数: > 核心线程数
        参数3：空闲线程最长存活时间
        参数4：参数3 的时间单位  TimeUnit.SECONDS
        参数5：任务队列  new ArrayBlockingQueue<>(10)
        餐数6：创建线程工厂  Executors.defaultThreadFactory()
        参数7：任务的拒绝策略 new ThreadPoolExecutor.AbortPolicy()
         */
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                5,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        pool.submit(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"....." +i);
            }
        });

        pool.submit(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"....." +i);
            }
        });

        pool.shutdown();

    }
}
