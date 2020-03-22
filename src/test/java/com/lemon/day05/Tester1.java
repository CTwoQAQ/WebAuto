package com.lemon.day05;

public class Tester1 {
    public static void main(String[] args) {
        WorkerInfo1 workerInfo1=new WorkerInfo1();
        Worker cooker=new Cooker();
        workerInfo1.getWorker(cooker);
        Worker teacher=new Teacher();
        workerInfo1.getWorker(teacher);
        Worker doctor=new Doctor();
        workerInfo1.getWorker(doctor);

     }
}
