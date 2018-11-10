<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	var sayFunc = new Function("name", "age" ,"alert(name+'今年'+age+'岁了')");
	//sayFunc("老汪", 2);
	alert("sayFunc方法对象的方法参数个数"+sayFunc.length);
</script>
</body>
</html>