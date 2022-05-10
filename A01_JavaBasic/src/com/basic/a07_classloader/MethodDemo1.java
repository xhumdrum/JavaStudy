package com.basic.a07_classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        // 1. 获得 Class 类的对象
        Class clazz = Class.forName("com.basic.a07_classloader.Student");

        // getMethods() 获取public 修饰的成员方法，包括父类的方法
        Method[] ms1 = clazz.getMethods();
        for (Method m : ms1) {
            System.out.println(m.getName());
        }

        // getDeclaredMethods() 获得全部成员方法，无视修饰，不包括父类方法
        System.out.println("------------------");
        Method[] ms2 = clazz.getDeclaredMethods();
        for (Method m : ms2) {
            System.out.println(m.getName());
        }

        // 创建对象
        Constructor dc = clazz.getDeclaredConstructor(String.class, int.class);
        Student student = (Student) dc.newInstance("张三", 12);

        // 获取单个成员方法
        Method getName = clazz.getMethod("getName");
        System.out.println(getName);

        // 执行成员方法
        Object invoke = getName.invoke(student);
        System.out.println(invoke);


    }
}
