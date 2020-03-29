package com.lemon.day010;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class XmlHomeWork {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        SAXReader saxReader = new SAXReader();
        FileInputStream fileInputStream = new FileInputStream(new File("F:\\IdeaProjects\\WebAuto\\src\\test\\resources\\UILibrary.xml"));
        Document document = saxReader.read(fileInputStream);
        Element root = document.getRootElement();
        List<Element> locatorElements = root.elements("page");
        for (Element locatorElement : locatorElements) {
//            System.out.println(locatorElement);
            locatorElement.attributeValue("keyword");
            System.out.println(locatorElement.attributeValue("keyword"));
            List<Element> elements = locatorElement.elements();
            Page page = new Page();
            ArrayList<Page> pages = new ArrayList<Page>();
            for (Element element : elements) {
/*              System.out.println(element);
                String name = element.getName();
                String text = element.getText();*/
                System.out.println(element.attributeValue("keyword"));
                System.out.println(element.attributeValue("by"));
                System.out.println(element.attributeValue("value"));
            }
            System.out.println(page);

        }

        }




    }

