package com.basic.a10_annotation;

/**
 * 创建一个实例，有注解的方法就执行，没有注解的方法就不能执行
 *
 */
public class UseTest {

    public void show1() {
        System.out.println("show1");
    }

    @AnnoTest
    public void show2() {
        System.out.println("show2");
    }

    @AnnoTest
    public void show3() {
        System.out.println("show3");
    }

}
