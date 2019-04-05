package edu.cn.huun.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.jdom2.output.XMLOutputter;

public class JDOM4J01 {
	public static void main(String[]args){
		// 获取文档
		Document document = DocumentHelper.createDocument();
		// 添加元素
		Element studentElement = document.addElement("student");
		studentElement.addAttribute("id", "001");
		studentElement.addAttribute("aa", "xx");
		// student中添加元素
		Element nameElement = studentElement.addElement("name");
		nameElement.setText("张三");
		Element sexElement = studentElement.addElement("sex");
		sexElement.setText("男");
		Element ageElement = studentElement.addElement("age");
		ageElement.setText("18");
		// 输出
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		try {
			
			XMLWriter writer = new XMLWriter(new FileOutputStream("src/student3.xml"), format);
			writer.write(document);
			System.out.println("成功");
			writer.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
