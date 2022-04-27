package com.basic.string;

public class StringBufferDemo {

    public static void main(String[] args) {

        countByString();  // 1590s

        countByStringBuffer();  // 7s

    }

    private static void countByStringBuffer() {
        long l1 = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 50000; i++) {
            sb.append(i);
        }
        String str = sb.toString();
        long l2 = System.currentTimeMillis();
        System.out.println(str + ":" + (l2 - l1));
    }

    private static void countByString() {

        long l1 = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 50000; i++) {
            str += i;
        }
        long l2 = System.currentTimeMillis();
        System.out.println(str + ":" + (l2 - l1));

    }

}
