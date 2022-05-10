package com.basic.a07_classloader;

import java.lang.reflect.Constructor;

public class ClassDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        /* 获取 Class类的对象
        通过下列三种方法获得的 Class类的对象是同一个对象
        1. Class.forName("全类名");
        2. 类名.class;
        3. 实例对象.getClass();
         */

        // 方法 一： Class 类的静态方法 forName（）+全类名
        Class clazz1 = Class.forName("com.basic.a07_classloader.Student");

        // 方法 二：类名 + 静态方法 .class
        Class clazz2 = Student.class;

        // 方法 三： 实例的 .getClass() 方法
        // .getClass 是定义在 Object 中的
        Student student = new Student();
        Class clazz3 = student.getClass();

        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);




    }
}
