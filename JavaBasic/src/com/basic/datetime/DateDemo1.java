package com.basic.datetime;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {

        // 空参表示电脑当前日期时间
        Date d1 = new Date();

        // 参数为毫秒值
        long l = System.currentTimeMillis() - 1000000000;
        Date d2 = new Date(l);

        // 时间原点的日期，因为本地时区，所以+8小时：Thu Jan 01 08:00:00 CST 1970
        Date d3 = new Date(0L);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println("-----------------------");

        // 得到毫秒值
        long t1 = d1.getTime();
        long l2 = System.currentTimeMillis();

        System.out.println(t1);
        System.out.println(l2);

        // 传递毫秒值
        d1.setTime(0L);
        System.out.println(d1);


    }
}
