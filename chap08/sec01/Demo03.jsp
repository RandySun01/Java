<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title> </title>
</head>
<body>

<script type="text/javascript">
		
	
	
	 function C(){
		 var privateFunc = function(){
			 alert("私有方法");
		 };
		 
		 privateFunc();
		 this.objFunc = function(){
			 alert("对象方法");
		 };
		 C.prototype.objFunc2 = function(){
			 alert("对象方法2");
		 };
	 }
	C.classFunc = function(){
		alert("类方法");
	};
	
	C.classFunc();
	var c = new C();
	c.objFunc();
	c.objFunc2();
	
	
	
	
	
	
	
</script>
</body>
</html>