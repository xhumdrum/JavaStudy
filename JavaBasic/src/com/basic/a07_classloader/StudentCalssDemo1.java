package com.basic.a07_classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentCalssDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // 1. 获取 Class 类的对象
        Class<?> clazz = Class.forName("com.basic.a07_classloader.Student");

        // 2 获取构造方法对象
        Constructor dc = clazz.getDeclaredConstructor(String.class, int.class);

        // 3. 利用构造方法创建对象
        Student student = (Student) dc.newInstance("张三",23);

        // 4. 获取成员变量，并赋值
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);  // 对 private 修饰的成员变量，要取消检查
        name.set(student,"李四");  // 赋值
        String str = (String) name.get(student); // 获取值

        System.out.println(str);
        System.out.println("-------------------------------");

        Field[] dfs = clazz.getDeclaredFields();
        for (Field df : dfs) {
            df.setAccessible(true);
            Object o = df.get(student);
            System.out.println(o);

        }

        System.out.println("-------------------------------");

        // 5. 获取成员方法
        Method[] dms = clazz.getDeclaredMethods();
        for (Method dm : dms) {
            System.out.println(dm.getName() + " --> "+dm);
        }

        Method returnTest = clazz.getMethod("returnTest", int.class);

        Object invoke = returnTest.invoke(student, 12);
        System.out.println(invoke);

        Method show = clazz.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke(student);



    }

}
