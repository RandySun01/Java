<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>服务器内部跳转</title>
</head>
<body>
<jsp:forward page="target.jsp">
	<jsp:param value="java" name="userName"/>
	<jsp:param value="123456" name="password"/>
</jsp:forward>
</body>
</html>