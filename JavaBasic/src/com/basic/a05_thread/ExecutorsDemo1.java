package com.basic.a05_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo1 {

    public static void main(String[] args) {

        // 线程池的创建，创建的是一个线程池控制对象
        //ExecutorService es = Executors.newCachedThreadPool();

        // 创建指定最大数量线程的线程池
        ExecutorService es = Executors.newFixedThreadPool(3);

        es.submit(() -> {
            for (int i = 0; i < 100 ; i++) {

                System.out.println(Thread.currentThread().getName() + "...." + i);
            }
        });
        es.submit(() -> {
            for (int i = 0; i < 100; i++) {

                System.out.println(Thread.currentThread().getName() + "---" + i);
            }
        });

        es.shutdown();

    }
}
