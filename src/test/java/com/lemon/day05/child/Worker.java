package com.lemon.day05.child;
//多态继承设计模式
public abstract class Worker {
    public abstract void work();
    public void dairlySchedual(){
        getup();
        gotowork();
    }
    public void  getup(){
        System.out.println("起床");
    }
    public void gotowork(){
        System.out.println("上班");
    }
}
