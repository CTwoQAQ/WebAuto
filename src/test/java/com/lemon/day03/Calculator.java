package com.lemon.day03;


import com.lemon.day01.WebGongJu;

import java.util.Scanner;

public class Calculator   extends WebGongJu {


    public int  subtraction(int code1,String fuhao,int code2){
        if ("+".equals(fuhao))
            return code1+code2;
        else if ("-".equals(fuhao))
        return code1-code2;
        else if ("*".equals(fuhao))
            return code1*code2;
        else
            return code1/code2;
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();//只能数字
        String b = input.next();
        int c = input.nextInt();

        System.out.println(calculator.subtraction(a,b,c));


    }
}
