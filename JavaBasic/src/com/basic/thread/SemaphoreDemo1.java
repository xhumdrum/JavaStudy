package com.basic.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class SemaphoreDemo1 {
    public static void main(String[] args) {

        Semaphore sp = new Semaphore(5);
        AtomicInteger it = new AtomicInteger();

        for (int i = 0; i < 100; i++) {

            new Thread(() -> {

                try {
                    // 获得通行证
                    sp.acquire();
                    // 执行

                    Thread.sleep(100);

                    int count = it.incrementAndGet(); // 正在执行的线程数 +1
                    System.out.println(Thread.currentThread().getName()
                            + "... begin run ..."
                            + count);

                    // 释放/归还通行证
                    sp.release();
                    count = it.decrementAndGet(); // 正在执行的线程数 -1
                    System.out.println(Thread.currentThread().getName()
                            + "... end run ..."
                            /*+ count*/);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



            }).start();

        }




    }



}
