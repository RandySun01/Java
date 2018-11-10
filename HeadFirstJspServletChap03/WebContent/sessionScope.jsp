<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>session只能在一个请求中保存数据</title>
</head>
<body>
<%
	//设置两个session范围的数据key-> value
	session.setAttribute("name", "session老王");
	session.setAttribute("age", 12);
%>
<h1>session值设置完毕！</h1>
 
</body>
</html>