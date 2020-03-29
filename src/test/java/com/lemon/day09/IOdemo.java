package com.lemon.day09;

import java.io.*;

public class IOdemo {
    public static void main(String[] args) throws IOException {
        InputStream InputStream = new FileInputStream(new File("F:\\A.txt"));
        OutputStream fileOutputStream = new FileOutputStream(new File("F:\\A1.txt"));
        while (true){
            //每次读到数据量
            int size=InputStream.read();

            if (size == -1) {
                break;
            }
            fileOutputStream.write(size);
        }
        System.out.println("finish");
    }
}

