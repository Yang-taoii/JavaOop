package com.kgc.oop.xml.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author：杨涛
 * 使用Dom4J读写学生对象集合
 */
public class Dom4jXmlToBean {

    private static List<Student> readXml() throws DocumentException {
        List<Student> list = new ArrayList<>();
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/student.xml"));
        Element students = document.getRootElement();
        Iterator<Element> it1 = students.elementIterator();
        while (it1.hasNext()){
            Student stu = new Student();
            Element student = it1.next();
            stu.setId(Integer.parseInt(student.attributeValue("id")));
            Iterator<Element> it2 = student.elementIterator();
            while (it2.hasNext()){
                String textName = it2.next().getText();
                stu.setName(textName);
                String textPass= it2.next().getText();
                stu.setPassword(textPass);
                list.add(stu);
            }
        }
        return list;

    }

    private static void writeXml(List<Student> list ) throws IOException {
        //生产一个空文档
        Document doc = DocumentHelper.createDocument();
        Element eleRoot = doc.addElement("所有学生");
        for (Student s:list) {
            Element stu = eleRoot.addElement("学生");
            stu.addAttribute("学生id",s.getId().toString());
            stu.addElement("学生姓名").addText(s.getName());
            stu.addElement("密码").addText(s.getPassword());
        }
        OutputFormat of = OutputFormat.createPrettyPrint();
        of.setEncoding("UTF-8");
        OutputStream os = new FileOutputStream(new File("src/学生信息.xml"));
        XMLWriter writer = new XMLWriter(os, of);
        writer.write(doc);
        writer.flush();
        System.out.println("学生信息已写入完成");

    }

    public static void main(String[] args) throws DocumentException, IOException {
        writeXml(readXml());
    }

}
