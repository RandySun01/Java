package edu.cn.huun.model;

public class Student {
	private String id;
	private String name;
	private String sex;
	private int age;
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getSex(){
		return this.sex;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public String toString(){
		return this.id+", "+this.name+", "+this.sex+", " + this.age;
	}

}
