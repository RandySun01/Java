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
	/*function say(name, age){
		alert(name+"年龄"+age+"岁了");
	}
	say("老汪", 1 );*/
	var sayFunc = new Function("name", "age" ,"alert(name+'今年'+age+'岁了')");
	sayFunc("老汪", 2);
	
</script>
</body>
</html>