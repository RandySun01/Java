<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="cn.edu.hnnu.model.People" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>对象操作</title>
</head>
<body> 
<%
	People people = new People();
	people.setId(1);
	people.setName("斩三");
	people.setAge(20);
	request.setAttribute("people", people);
%>
 <h1>编号：${people.id }</h1>
 <h1>姓名：${people.name  }</h1>
  <h1>年龄：${people.age  }</h1>
 </body>
</html>