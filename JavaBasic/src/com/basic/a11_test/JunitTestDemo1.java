package com.basic.a11_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 测试：
 * 需要导入 junit 的 jar 包
 */

public class JunitTestDemo1 {

    public static void main(String[] args) {

        JunitTestDemo1 jtd = new JunitTestDemo1();
        jtd.show();
    }


    @Test
    public void show() {
        System.out.println("Junit Test");
    }

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

}
