package com.lemon.day05.child;

public class Tester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.dairlySchedual();
        teacher.work();
        Doctor doctor=new Doctor();
        doctor.dairlySchedual();
        doctor.work();
    }
}
