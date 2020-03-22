package com.lemon.day07;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
        File file=new File("F:\\IdeaProjects\\WebAuto\\src\\test\\resources\\log4j.properties");
        //判断是否存在
        System.out.println(file.exists());
    }
}
