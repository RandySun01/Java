<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	
%>
<jsp:useBean id="student" scope="page" class="cn.edu.hnnu.model.Student"></jsp:useBean>
<jsp:setProperty property="name" name="student"/>
<jsp:setProperty property="age" name="student" value="100"/>
<h1>姓名: <%=student.getName() %></h1>
<h1>年龄: <%=student.getAge() %></h1>
</body>
</html>