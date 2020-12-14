package com.kgc.oop.xml.dom;

import com.kgc.oop.xml.dom4j.Phone;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author：杨涛
 */
public class DomXmlToBean {
    Document doc = null;
    public  void getDocument(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            doc = documentBuilder.parse("src/最新手机资讯.xml");
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    private List<Phone> readXml(){
        List<Phone> phoneList = new ArrayList<>();
        NodeList nodeList = doc.getElementsByTagName("手机品牌");
        for (int i = 0; i <nodeList.getLength() ; i++) {
            Phone phone = new Phone();
            Element brand = (Element) nodeList.item(i);
            phone.setBrand(brand.getAttribute("品牌名称"));
            NodeList brandChildNodes = brand.getChildNodes();
            phone.setType(brandChildNodes.item(1).getTextContent());
            phone.setCreateTime(brandChildNodes.item(3).getTextContent());
            phoneList.add(phone);
        }
        return phoneList;
    }

    private void writeXml(List<Phone> list) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("src/Phone.xml"));
        transformer.transform(source, result);
        System.out.println("手机信息XML文件写入完成");
    }





    public static void main(String[] args) throws TransformerException {
        DomXmlToBean d = new DomXmlToBean();
        d.getDocument();
        d.writeXml(d.readXml());
    }
}
