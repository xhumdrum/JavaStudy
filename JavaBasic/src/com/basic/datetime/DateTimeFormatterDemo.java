package com.basic.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

    public static void main(String[] args) {

        // DateTimeFormatter 是JDK8 的新特性
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime ldt1 = LocalDateTime.parse("2022-01-02 23:12:12", dtf);

        LocalDateTime ldt2 = ldt1.plusDays(1);
        LocalDateTime ldt3 = ldt1.plusDays(-1);

        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
    }
}
