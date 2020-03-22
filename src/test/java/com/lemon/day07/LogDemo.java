package com.lemon.day07;

import org.apache.log4j.Logger;

public class LogDemo {
    //创建logger对象，填写目录
    public  static Logger logger=Logger.getLogger("log4j.properties");
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int res= a+b;
        logger.error(res);

    }
}
