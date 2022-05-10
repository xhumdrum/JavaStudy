package com.basic.a10_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnoDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {

        // 通过反射，获取该类的对象
        Class clazz = Class.forName("com.basic.a10_annotation.UseTest");

        // 创建UseTest 实例
        UseTest useTest = new UseTest();

        // 获取所有方法
        Method[] methods = clazz.getMethods();

        // 遍历方法
        for (Method method : methods) {

            if (method.isAnnotationPresent(AnnoTest.class)) {
                method.invoke(useTest);
            }

        }
    }


}
