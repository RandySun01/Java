package edu.cn.huun.xml;

import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class JDOM02 {
	public static void main(String[] args) throws Exception{
		// 构建文档
		SAXBuilder builder = new SAXBuilder();
		Document document = builder.build("src/students.xml");
		// 获取根节点
		Element students = document.getRootElement();
		// 获取子节点
		List studentList = students.getChildren("student");
		for (int i = 0; i < studentList.size(); i++) {
			// 获取元素
			Element student = (Element)studentList.get(i);
			String id = student.getAttributeValue("id");
			String name = student.getChildText("name");
			String sex = student.getChildText("sex");
			String age = student.getChildText("age");
			System.out.println("学号： "+id+" 姓名: "+name +" 性别： " + sex+" 年龄：" +age);
		}
		
	}

}
