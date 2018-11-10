<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>page只能在一个页面中保存数据</title>
</head>
<body>
<%
	//设置两个page范围的数据key-> value
	pageContext.setAttribute("name", "page老王");
	pageContext.setAttribute("age", 12);
%>
<%
	//取值
	String name = (String)pageContext.getAttribute("name");
	//out.println(name+"\n");
	int age = (Integer)pageContext.getAttribute("age");
	
%>
<font>姓名：<%=name %></font>
<font>年龄:<%=age %></font>
</body>
</html>