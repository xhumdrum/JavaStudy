package com.basic.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomeThread implements Runnable {
    //private int count = 0;

    // 原子类
    AtomicInteger ac = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int count = ac.incrementAndGet();
            System.out.println("处理..." + count);
        }
    }
}
