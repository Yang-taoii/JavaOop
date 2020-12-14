package com.kgc.oop.xml.dom4j;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author：杨涛
 */
public class Dom4jXmlToBean2 {
    private static void writeXml(List<Phone> list) throws IOException {
        Document doc = DocumentHelper.createDocument();
        Element eleRoot = doc.addElement("最新手机信息");
        for (Phone phone : list) {
            Element eachPhone = eleRoot.addElement("手机品牌");
            eachPhone.addAttribute("品牌名称",phone.getBrand());
            eachPhone.addElement("类型").addText(phone.getType());
            eachPhone.addElement("发布时间").addText(phone.getCreateTime().toString());
        }
        OutputFormat of = OutputFormat.createPrettyPrint();
        of.setEncoding("UTF-8");
        of.setIndentSize(5);
        OutputStream os = new FileOutputStream(new File("src/最新手机资讯.xml"));
        XMLWriter writer = new XMLWriter(os, of);
        writer.write(doc);
        writer.flush();
        System.out.println("XML文件写入完成");
    }




    public static void main(String[] args) throws IOException, DocumentException {
        List<Phone> list = new ArrayList<>();
        Phone phone1 = new Phone("华为","Mate40Pro",new Date().toString());
        Phone phone2 = new Phone("iphone","iphone13",new Date().toString());
        Phone phone3 = new Phone("小米","小米11",new Date().toString());
        list.add(phone3);
        list.add(phone2);
        list.add(phone1);

        writeXml(list);
    }

}
