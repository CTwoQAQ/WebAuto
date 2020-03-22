package com.lemon.day06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//正则表达式
public class RegexDemo {
    public static void main(String[] args) {
        String value="共 30 页";
        String regex="\\d+";
        //创建一个Pattern对象，传进了一个正则表达式
        Pattern pattern=Pattern.compile(regex);
        //获取一个匹配对象Matcher
        Matcher matcher=pattern.matcher(value);
        //判断Matcher当中是否有匹配到数据
        if (matcher.find() ) {
            System.out.println("found");
            System.out.println(matcher.group(0));

        }
        else {
            System.out.println("not found");
        }
    }
}
