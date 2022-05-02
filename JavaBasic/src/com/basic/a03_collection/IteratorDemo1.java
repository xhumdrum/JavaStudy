package com.basic.a03_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaaaaaa");
        strings.add("bbbbb");
        strings.add("ccccc");
        strings.add("rrrrr");
        strings.add("sssss");

        // 迭代器遍历
        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


        // 使用迭代器删除元素
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.length()<=5) {
                iterator.remove();
            }
        }

        // foreach 遍历
        for (String s:
                strings) {
            System.out.println(s);
        }

    }

}
