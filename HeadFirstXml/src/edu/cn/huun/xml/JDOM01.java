package edu.cn.huun.xml;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

public class JDOM01 {
	public static void main(String[] args){
		// 创建dom节点
		Element student = new Element( "student");
		// 设置属性
		Attribute id = new Attribute("id", "001");
		Attribute aa = new Attribute("aa", "xx");
		// 添加
		student.setAttribute(id);
		student.setAttribute(aa);
		Element name = new Element("name");
		name.setText("张三");
		student.addContent(name);
		Element sex = new Element("sex");
		sex.setText("男");
		student.addContent(sex);
		Element age = new Element("age");
		age.setText("20");
		student.addContent(age);
		
		// 定义文档
		Document document = new Document(student);
		// xml输出器
		XMLOutputter out = new XMLOutputter();
		// 定义格式                           设置编码 
		out.setFormat(out.getFormat().setEncoding("UTF-8"));
		
		
		try {
			// 输出						输出流
			out.output(document, new FileOutputStream("src/student2.xml"));
			System.out.println("成功生成");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
