<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 <form action="el2.jsp" method="post">
 <input type="text" name="name"/>
 <input type="submit" value="提交el2.jsp">
 </form>
 <a href="el2.jsp?age=12">提交el2.jsp</a>
 <form action="el2.jsp" method="post">
 <input type="checkbox" name="hobby" value="java语言"/>java语言
<input type="checkbox" name="hobby" value="c语言"/>c语言
<input type="checkbox" name="hobby" value="c++语言"/>c++语言
 <input type="submit" value="提交el2.jsp">
 </form>
 
  </body>
</html>