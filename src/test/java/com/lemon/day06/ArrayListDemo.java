package com.lemon.day06;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("你妈的1");
        list.add("你妈的2");
        list.add("你妈的3");
         System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.get(1));
        list.remove("你妈的1");
        list.remove(0);
        list.set(0,"你好");
        System.out.println(list.size());
        //迭代器
        Iterator<String> iterator = list.iterator();
        iterator.hasNext();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
