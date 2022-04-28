package com.basic.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();
        c.add("aaaa");
        c.add("bbbbb");
        c.add("ccccc");
        c.add("dddddd");

        System.out.println(c);

        // removeIf 按条件删除
        boolean b = c.removeIf((String s) -> s.length() == 4);

        if (b) {
            System.out.println(c);
        }





    }
}
