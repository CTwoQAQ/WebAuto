package com.lemon.day06;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("阿里巴巴1");
        set.add("阿里巴巴2");
        set.add("阿里巴巴3");
        String [] values=new String[set.size()];
        String[] values1 = set.toArray(values);
        for (String s : values1) {
            System.out.println(s);
        }
        //迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
