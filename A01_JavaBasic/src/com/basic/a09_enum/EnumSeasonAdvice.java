package com.basic.a09_enum;

import java.sql.SQLOutput;

public enum EnumSeasonAdvice {

    /*
    1. 枚举项必须是第一行代码
    2. 枚举项其实也是这个类的对象
    3. 如果类里有抽象方法，则每个项目必须重写抽象方法
     */
    SPRING("春"){
        @Override
        public void show(){
            System.out.println(this.name);
        }
    },
    SUMMER("夏"){
        @Override
        public void show(){
            System.out.println(this.name);
        }
    },
    AUTUMN("秋"){
        @Override
        public void show(){
            System.out.println(this.name);
        }
    },
    WINTER("冬"){
        @Override
        public void show(){
            System.out.println(this.name);
        }
    };

    // 枚举类可以有成员变量
    public String name;

    // 1.枚举类如果写构造方法，必须要有空参构造方法
    // 2.因为枚举成员就是这个类，它需要空参构造方法，比如 SPRING()
    // 3.枚举的构造方法必须为 private
    private EnumSeasonAdvice(){

    }
    private EnumSeasonAdvice(String name) {
        this.name = name;
    }

    public abstract void show();


}
