package com.basic.a10_annotation;

import java.lang.annotation.*;

//元注解：注解的注解

// 注解表示存活时间是运行时间 （一般的注解存活时间是编译期间）
@Retention(value = RetentionPolicy.RUNTIME)

// 指定注解的使用位置
@Target({ElementType.FIELD,ElementType.TYPE,ElementType.CONSTRUCTOR})

// 指定该注解可以被继承
@Inherited
public @interface Test {
}

