<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="cn.edu.hnnu.model.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	Student student = new Student();
	student.setAge(18);
	student.setName("老万");
	
%>
<h1>姓名：<%=student.getName() %></h1>
<h1>年龄： <%=student.getAge() %></h1>
</body>
</html>