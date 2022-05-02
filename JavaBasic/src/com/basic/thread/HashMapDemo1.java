package com.basic.thread;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo1 {
    public static void main(String[] args) throws InterruptedException {

        // HashMap 多线程时有安全问题
        //HashMap<String, String> table = new HashMap<>();
        // Hashtable 有同步安全锁，单采用的是悲观锁，效率低下
        //Hashtable<String, String> table = new Hashtable<>();

        // ConcurrentHashMap 数据是安全的，效率高
        ConcurrentHashMap<String, String> table = new ConcurrentHashMap<>();


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                table.put(i + "", i + "");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 50; i < 101; i++) {
                 table.put(i + "", i + "");
            }
        });

        t1.start();
        t2.start();

        Thread.sleep(1000);

        for (Map.Entry<String,String> en:table.entrySet()) {
            System.out.println(en.getKey()+"..."+en.getValue());
        }



    }
}
