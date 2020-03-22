package com.lemon.day08;

public class Student {
    private String name;
    private int age;
    private String xingbie;

    public Student(String name, int age, String xingbie) {
        this.name = name;
        this.age = age;
        this.xingbie = xingbie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getXingbie() {
        return xingbie;
    }
}
