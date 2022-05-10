package com.basic.a04_datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        // SimpleDateFormat 时间格式化和解析
        // 带有格式化规则的时间处理工具

        // 格式化对象 Date
        Date d1 = new Date();
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String f1 = sf1.format(d1);
        System.out.println(f1);

        // 解析对象：时间字符串 2022年1月1日 0:0:0
        String str = "2022年1月1日 0:0:0";
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy年M月d日 hh:mm:ss");
        Date p1 = sf2.parse(str);
        System.out.println(p1);


    }
}
