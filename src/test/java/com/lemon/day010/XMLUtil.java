package com.lemon.day010;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class XMLUtil {
    public List<Page> getPageList() throws Exception {
        //1.创建解析器
        SAXReader Reader = new SAXReader();
        //2.获取document文档对象
        String pathname="F:\\IdeaProjects\\WebAuto\\src\\test\\resources\\UILibrary.xml";
        FileInputStream in = new FileInputStream(new File(pathname));
        Document document = Reader.read(in);
        //3.获取根节点
        Element rootElement = document.getRootElement();
        //4.通过根节点遍历子节点
        List<Element> pageElements = rootElement.elements("page");
        ArrayList<Page> pages = new ArrayList<Page>();
        //循环处理所有的page元素（一个page元素对应一个page对象）
        for (Element pageElement : pageElements) {
            String keyword = pageElement.attributeValue("keyword");
            //获取page底下的所有locator子元素
            List<Element> locatorElemnts = pageElement.elements("locator");
            ArrayList<Locator> locators = new ArrayList<Locator>();
            //循环处理pager底下的子元素
            for (Element locatorElement : locatorElemnts) {
                String keywordoflocator=locatorElement.attributeValue("keyword");
                String byoflocator=locatorElement.attributeValue("by");
                String valueoflocator=locatorElement.attributeValue("value");
                //取到LOCATOR元素的三个属性值，封装成locator对象
                Locator locator = new Locator(keywordoflocator, byoflocator, valueoflocator);
                locators.add(locator);
            }
            Page page = new Page(keyword, locators);
            pages.add(page);
        }
        return  pages;
    }

    public static void main(String[] args) throws Exception {
        XMLUtil util = new XMLUtil();
        List<Page> pages = util.getPageList();
        for (Page page : pages) {
            System.out.println(page.getKeyword());
            List<Locator> locatorsUnderPage = page.getLocatorsUnderPage();
            for (Locator locator : locatorsUnderPage) {
                System.out.println(locator);
            }
        }

    }


}
