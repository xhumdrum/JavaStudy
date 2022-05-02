package com.basic.a07_classloader;

import java.lang.reflect.Field;

public class FieldDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        // 1. 获得 Class 类的对象
        Class clazz = Class.forName("com.basic.a07_classloader.Student");

        // 获取成员数组
        Field[] f1 = clazz.getFields();
        for (Field field : f1) {
            System.out.println(field.getName());
        }
        System.out.println("------------------");

        Field[] f2 = clazz.getDeclaredFields();
        for (Field field : f2) {
            System.out.println(field.getName());
        }

        System.out.println("------------------");

        // 获取单个的成员变量
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);
        Field age = clazz.getField("age");
        System.out.println(age);



    }
}
