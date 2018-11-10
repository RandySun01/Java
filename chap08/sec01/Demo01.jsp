<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title> </title>
</head>
<body>
dfsrfe
<script type="text/javascript">
		 var marry={
				 name:"marry",
				 age: 2,
				 shout: function() {
					 alert("我是："+this.name+"今年:"+this.age);
				 },
				 action: function(){
					 alert("会吃");
				 }
				 
		 };
		 
		 alert(marry.name);
		 alert(marry.age);
		 marry.shout();
		 marry.action();
		 
		 function Dog(name, age){
			 this.name = name;
			 this.age = age;
			 this.shout = function(){
			 alert("我是："+this.name+"今年:"+this.age);
			 };
			 this.action = function(){
				 alert("会跑");
			 };
		 }
		 
		 var jack = new Dog("jack", 1);
		 alert(jack.name);
		 alert(jack.age);
		 jack.shout();
		 jack.action();
		 
		 
</script>
</body>
</html>