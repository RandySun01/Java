<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>appliction只能在一个请求中保存数据</title>
</head>
<body>

<%
	//取值
	String name = (String)application.getAttribute("name");
	int age = (Integer)application.getAttribute("age");
	
%>
<font>姓名：<%=name %><br/></font>
<font>年龄: <%=age %></font>
</body>
</html>