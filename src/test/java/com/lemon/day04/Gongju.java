package com.lemon.day04;
//多态
public class Gongju {
    public void tester(Iphone aa){
        aa.showpricd();
    }

    public static void main(String[] args) {
        Gongju gongju=new Gongju();
        Iphone iphone4=new Iphone4();
        gongju.tester(iphone4);
    }
}
