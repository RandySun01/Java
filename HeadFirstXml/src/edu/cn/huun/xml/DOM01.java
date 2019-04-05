package edu.cn.huun.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DOM01 {

	public static void main(String[] args){
		// 创建DOM模式的解析器对象 
		DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
		try {
			// 方法得到 DOM 解析器对象
			DocumentBuilder builer = factory.newDocumentBuilder();
			// 解析 XML 文档
			Document doc = builer.parse("src/student.xml");
			// 得到 XML 文档的根节点
			NodeList nodeList = doc.getElementsByTagName("student");
			Element e = (Element)nodeList.item(0);
			System.out.println("姓名："+e.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
			System.out.println("性别："+e.getElementsByTagName("sex").item(0).getFirstChild().getNodeValue());
			System.out.println("年龄："+e.getElementsByTagName("age").item(0).getFirstChild().getNodeValue());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
