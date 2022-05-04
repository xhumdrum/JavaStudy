package com.basic.a09_enum;

public class EnmuDemo1 {


    public static void main(String[] args) {
        /*
        1. 所有枚举类都是 enum 的子类
        2. 可以用过 枚举类名.枚举项名 来访问枚举内容项目
        3. 每一个枚举项目也是一个枚举类，如：EnumSeason.SPRING 也是 EnumSeason 类

         */

        // 简单枚举
        EnumSeason spring1 = EnumSeason.SPRING;

        // 复杂枚举类
        EnumSeasonAdvice spring = EnumSeasonAdvice.SPRING;
        System.out.println(spring);
        spring.show();

        System.out.println("-----------------------");

        System.out.println(spring.name());  // 枚举项的名称
        System.out.println(spring.ordinal()); // 枚举项的索引

        System.out.println("-----------------------");

        // 枚举项目比较(compareTo)的是索引差
        int i = EnumSeason.SPRING.compareTo(EnumSeason.WINTER);
        System.out.println(i);  // 0-3 = -3

        System.out.println("-----------------------");

        // 获取指定的枚举项对象
        EnumSeason spring2 = Enum.valueOf(EnumSeason.class, "SPRING");
        System.out.println(spring2);
        // 与 EnumSeason.SPRING 获取的对象是同一个
        System.out.println( EnumSeason.SPRING == spring2);  // true

        System.out.println("-----------------------");

        // 获取全部的枚举项
        EnumSeason[] values = EnumSeason.values();
        for (EnumSeason value : values) {
            System.out.println(value);
        }

    }


}
