package com.basic.a05_thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo1 {


    public static void main(String[] args) {

        // 相当一个计数器
        CountDownLatch cdl = new CountDownLatch(3);

        // 等待线程
        new Thread( () -> {
            //等待三个执行线程结束后，计数器=0 时唤醒
            try {
                cdl.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("is over");

        }).start();

        // 三个执行线程
        new Thread( () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("A 处理..." + i);
            }
            cdl.countDown();  // 计数器-1
        }).start();

        new Thread( () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("B 处理..." + i);
            }
            cdl.countDown();  // 计数器-1
        }).start();

        new Thread( () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("C 处理..." + i);
            }
            cdl.countDown();  // 计数器-1
        }).start();





    }

}
