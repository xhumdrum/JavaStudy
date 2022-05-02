package com.basic.a07_classloader;

import java.lang.reflect.Constructor;

public class ConstructorDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class clazz = Class.forName("com.basic.a07_classloader.Student");

        /* 获取构造方法对象数组
        1. getConstructors() 可以获取全部 public 修饰的构造方法
        2. getDeclaredConstructors() 可以获取全部构造方法，无视修饰
         */
        Constructor[] cs1 = clazz.getConstructors();
        for (Constructor c : cs1) {
            System.out.println(c);
        }

        System.out.println("----");

        Constructor[] cs2 = clazz.getDeclaredConstructors();
        for (Constructor c : cs2) {
            System.out.println(c);
        }

        System.out.println("--------------------");

        /*
        获取指定的构造方法：
        1. getConstructor（） 获取public修饰的构造方法
        2. getDeclaredConstructor（） 获取构造方法，无视修饰
        获取带参数的构造方法，需要传递的参数与构造方法的参数一致
         */
        Constructor c1 = clazz.getConstructor();
        Constructor c2 = clazz.getDeclaredConstructor();
        System.out.println(c1);
        System.out.println(c2);

        //Constructor c3 = clazz1.getConstructor(String.class);  // 抛出异常，不能获取private 修饰的构造方法
        Constructor c4 = clazz.getDeclaredConstructor(String.class);
        //System.out.println(c3);
        System.out.println(c4);

    }
}
