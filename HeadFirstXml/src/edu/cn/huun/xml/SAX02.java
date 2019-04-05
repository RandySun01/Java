package edu.cn.huun.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import edu.cn.huun.model.Student;

public class SAX02 extends DefaultHandler{
	private List<Student> students = null;
	private Student student = null;
	private String preTag= null;//标记上一个标签 
	@Override
	public void startDocument() throws SAXException {
		System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		students=new ArrayList<Student>();
		
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("\n 学生信息读取完毕");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if("student".equals(qName)){
			student=new Student();
			student.setId(attributes.getValue(0));
		}
		preTag=qName;
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if("student".equals(qName)){
			students.add(student);
			student=null;
		}
		preTag=null;
	}

	
	
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(preTag != null){
			
			String content = new String(ch, start, length);
			 if("name".equals(preTag)){
				student.setName(content);
				
			}else if("sex".equals(preTag)){
				student.setSex(content);
			}else if("age".equals(preTag)){
				student.setAge(Integer.parseInt(content));
			}
		}
	}

	

	

	
	
	public static void main(String[] args) throws Exception{
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		SAX02 sax02 = new SAX02();
		parser.parse("src/Students.xml", sax02);
				
		for(Student s:sax02.students){
			System.out.println(s);
		}
		
	}

}
