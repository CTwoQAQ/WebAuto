package com.lemon.day09;

import com.lemon.day08.Student;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class XmlParser {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        //创建解析器
        SAXReader saxReader = new SAXReader();
        FileInputStream fileInputStream = new FileInputStream(new File("F:\\IdeaProjects\\WebAuto\\src\\test\\resources\\Student.xml"));
        //获取document文档对象
        Document document = saxReader.read(fileInputStream);
        //获取根节点
        Element root = document.getRootElement();
        //遍历得到子节点
        List<Element> studetnElements = root.elements("student");
        Element studetnElement = (Element) studetnElements.get(0);
        //取出属性no（学号）
        String no = studetnElement.attributeValue("no");
        System.out.println(no);
        //取出<student>元素的子元素
        List<Element> elements = studetnElement.elements();
        Student student = new Student();
        //遍历集合，处理每一个子元素
        for (Element element : elements) {
            System.out.println(element);
            //取出元素的名字
            String name = element.getName();
            //取出元素值
            String text = element.getText();
            if ("name".equals(name)){
                student.setName(text);

            }
            else if ("age".equals(name)){
                student.setAge(Integer.valueOf(text));

            }
            else if ("gender".equals(name)){
                student.setXingbie(text);

            }
            else if ("address".equals(name)){
                student.setAddress(text );

            }
        }
        System.out.println(student);


    }

}
