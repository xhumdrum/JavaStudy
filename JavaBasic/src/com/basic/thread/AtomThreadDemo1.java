package com.basic.thread;

public class AtomThreadDemo1 {
    public static void main(String[] args) {
        AtomeThread at = new AtomeThread();

        for (int i = 0; i < 10; i++) {
            new Thread(at).start();
        }


    }
}
