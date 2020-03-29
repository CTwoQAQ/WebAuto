package com.lemon.day09;

import java.io.*;

public class Properties {
    public static void main(String[] args) throws IOException {
        java.util.Properties properties = new java.util.Properties();
        File file = new File("F:\\IdeaProjects\\WebAuto\\src\\test\\resources\\log4j.properties");
        InputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        System.out.println(properties.get("log4j.appender.E"));
    }
}
