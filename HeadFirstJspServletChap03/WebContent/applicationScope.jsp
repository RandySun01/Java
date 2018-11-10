<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>application只能在一个请求中保存数据</title>
</head>
<body>
<%
	//设置两个session范围的数据key-> value
	application.setAttribute("name", "application老王");
	application.setAttribute("age", 12);
%>
<h1>application值设置完毕！</h1>
</body>
</html>