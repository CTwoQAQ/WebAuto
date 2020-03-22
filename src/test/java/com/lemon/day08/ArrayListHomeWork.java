package com.lemon.day08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListHomeWork {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student student1 = new Student("张三",11,"男");
        Student student2 = new Student("李四",12,"男");
        Student student3 = new Student("小花",13,"女");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.remove(student3);
        list.get(0).setName("王五");
        for (Student student : list) {
            System.out.println(student.getName()+student.getAge()+student.getXingbie());
        }
        Iterator<Student> iterator=list.iterator();
        iterator.hasNext();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}
