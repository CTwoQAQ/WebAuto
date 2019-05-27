package com.lemon.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by stjj on 2019/5/20.
 */
public class FireFoxDemo {
    public static void main(String[] args) {
        //启动浏览器
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        //访问地址：http：//www.baidu.com
        webDriver.get("https://www.baidu.com");
        webDriver.quit();
    }
}
