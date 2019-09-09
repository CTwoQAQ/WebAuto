package com.lemon.day02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by stjj on 2019/7/29.
 */
public class ElementLocate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        //访问地址：http：//www.baidu.com
        webDriver.get("https://ews.mingdao-info.com/index.aspx");
        webDriver.findElement(By.id("_easyui_textbox_input1")).sendKeys("system");
//        webDriver.findElement(By.id("_easyui_textbox_input2")).sendKeys("103");
        //通过xpath定位元素
        webDriver.findElement(By.xpath("//*[@id=\"_easyui_textbox_input2\"]")).sendKeys("103");
        //点击按钮
        webDriver.findElement(By.xpath("//*[@id=\"ff\"]/div/div/div[5]/a")).click();
        webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[7]/div[1]/div[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"_easyui_tree_51\"]/span[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"_easyui_tree_56\"]/span[4]")).click();
        webDriver.switchTo().frame("员工汇总工资表");
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("/html/body/div[1]/div/div/a[1]/span/span[1]")).click();
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
        Thread.sleep(8000);
        webDriver.quit();
    }
}
