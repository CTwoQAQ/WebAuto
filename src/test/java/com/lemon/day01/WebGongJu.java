package com.lemon.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by stjj on 2019/8/2.
 */
public class WebGongJu {
    public void Lianjie(String url){
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        //访问地址：http：//www.baidu.com
        webDriver.get(url);
    }

}
