package com.kgc.oop.xml.xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;
import java.util.Scanner;

/**
 * @author：杨涛
 */
public class XpathParseXml {

    public static void main(String[] args) throws DocumentException {

        SAXReader saxReader = new SAXReader();
        Document doc = saxReader.read("src/最新手机资讯.xml");

        //selectSingleNode获取单个节点，相同的节点默认查询第一个
        Node node = doc.selectSingleNode("//类型");
        Element element = (Element) doc.selectSingleNode("//手机品牌");
        System.out.println(element.attributeValue("品牌名称"));
        System.out.println(node.getText());
        System.out.println("*********************************************************");

        //获取所有 <手机品牌> 节点的 品牌名称属性
        List<Node> list = doc.selectNodes("//手机品牌");
        for (Node node1:list) {
            Element e = (Element)node1;
            System.out.println(e.attributeValue("品牌名称"));
        }
        System.out.println("*********************************************************");
        List<Node> list1 = doc.selectNodes("//手机品牌//类型");
        for (Node node1:list1){
            Element e = (Element)node1;
            System.out.println(e.getText());
        }
        System.out.println("*********************************************************");
        login();
    }

    public static void login() throws DocumentException {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name=input.next();
        System.out.print("请输入密码：");
        String pass=input.next();
        SAXReader sr=new SAXReader();
        Document doc = sr.read("src/users.xml");
        Node node = doc.selectSingleNode("//user[@name='"+name+"' and @pass='"+pass+"']");
        System.out.println(node==null?"错误":"正确");
    }

}
