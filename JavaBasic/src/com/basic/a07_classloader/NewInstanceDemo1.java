package com.basic.a07_classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /*
        利用反射，获取构造方法，创建对象
         */

        // 1. 获得 Class 类的对象
        Class clazz = Class.forName("com.basic.a07_classloader.Student");
        // 2. 获得构造方法
        Constructor cs = clazz.getDeclaredConstructor(String.class, int.class);
        // 3. 使用 newInstance() 方法创建对象，参数就是构造方法中的实参
        Object o = cs.newInstance("xiaoming",12);
        // 打印对象
        System.out.println(o);

        //------------------------------------------------------

        // 2. 获取Private 修饰的构造方法
        Constructor cs2 = clazz.getDeclaredConstructor(String.class);
        // 3. 对于 private 修饰的构造方法，需要临时取消private 限制，才可以创建对象<<<<<<
        cs2.setAccessible(true);
        // 4. 创建对象
        Object o1 = cs2.newInstance("zhangsan");
        // 5. 打印对象
        System.out.println(o1);


    }
}
