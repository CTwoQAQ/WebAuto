package com.lemon.day09;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class IOdemo2 {
    public static void main(String[] args) throws IOException {
        File srcfile = new File("F:\\A.txt");
        File destFile = new File("F:\\A1.txt");
        FileUtils.copyFile(srcfile,destFile);

    }
}

