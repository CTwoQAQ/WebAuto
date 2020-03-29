package com.lemon.day08;

public class Student {
    private String name;
    private int age;
    private String xingbie;
    private String address;

    public Student() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, int age, String xingbie, String address) {
        this.name = name;
        this.age = age;
        this.xingbie = xingbie;
        this.address = address;
    }
    public Student(String name, int age, String xingbie) {
        this.name = name;
        this.age = age;
        this.xingbie = xingbie;
        this.address = address;
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
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", xingbie='" + xingbie + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}

