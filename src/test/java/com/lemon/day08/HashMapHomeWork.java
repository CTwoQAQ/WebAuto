package com.lemon.day08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapHomeWork {
    public static void main(String[] args) {
        Map<String, ArrayList<Student>> map = new HashMap<String, ArrayList<Student>>();
        Student student1 = new Student("张三",24,"男");
        Student student2 = new Student("啊三",24,"男");
        Student student3 = new Student("的三",24,"男");
        Student student4 = new Student("好三",24,"男");
        Student student5 = new Student("他三",24,"男");
        ArrayList<Student> list1801 = new ArrayList<Student>();
        list1801.add(student1);
        list1801.add(student2);
        map.put("1801",list1801);
        for (Student class1801 : list1801) {
            System.out.println(class1801.getName());
        }
        ArrayList<Student> list1802 = new ArrayList<Student>();
        list1802.add(student3);
        list1802.add(student4);
        list1802.add(student5);
        map.put("1802",list1802);
        for (Student class1802 : list1802) {
            System.out.println(class1802.getName());
        }
        Set<Map.Entry<String, ArrayList<Student>>> entries = map.entrySet();

    }
}
