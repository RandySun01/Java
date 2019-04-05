package edu.cn.huun.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOM02 {
	public static void printNode(Node node){
		NamedNodeMap  nm = node.getAttributes();
		for (int i = 0; i < nm.getLength(); i++) {
			Node  nod = nm.item(i);
			System.out.println(nod.getNodeName()+":" + nod.getFirstChild().getNodeValue());
		}
	}

	public static void main(String[] args){
		// 创建工厂对象
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// 创建解析对象
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("src/students.xml");
			NodeList  nodelist = doc.getElementsByTagName("students");			
			Element e = (Element)nodelist.item(0);
			NodeList studentNodeList = e.getElementsByTagName("student");
			System.out.println(studentNodeList.getLength());
			for (int i = 0; i < studentNodeList.getLength(); i++) {
				Element element = (Element)studentNodeList.item(i);
				
				System.out.println("姓名: "+element.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
				printNode(element.getElementsByTagName("name").item(0));
				System.out.println("性别: "+element.getElementsByTagName("sex").item(0).getFirstChild().getNodeValue());
				System.out.println("年龄: "+element.getElementsByTagName("age").item(0).getFirstChild().getNodeValue());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
