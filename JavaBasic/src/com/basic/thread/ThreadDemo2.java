package com.basic.thread;

public class ThreadDemo2 {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setName("执行线程");
        t2.setName("守护线程");

        // 设置 t2 为守护线程
        /*
        守护线程：
         当其他线程结束后，守护线程也随之结束。
         */
        t2.setDaemon(true);

        t1.start();
        t2.start();

    }


}
