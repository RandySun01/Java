<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>集合操作</title>
</head>
<body> 
<%
	List all =  new LinkedList();
	all.add(0,"元素0");
	all.add(1,"元素0");
	all.add(2,"元素3");
	request.setAttribute("all", all);
%>
<h1>元素0：${all[0] }</h1>
<h1>元素1：${all[1]  }</h1>
<h1>元素3：${all[2]  }</h1>
 </body>
</html>