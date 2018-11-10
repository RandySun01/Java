<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>继承 </title>
</head>
<body>

<script type="text/javascript">
	function Animal(name, age){
		 this.name = name;
		 this.age = age;
		 this.shout = function(){
		 alert("我是："+this.name+"今年:"+this.age);
		 };
		 this.action = function(){
			 alert("会跑");
		 };
	}	
	function Dog(name, age){
		Animal.apply(this, [name,age]);
	}
	Dog.prototype = new Animal();
	var jack = new Dog("JACK", 2);
	alert(jack.name);
	alert(jack.age);
	jack.shout();
	jack.action();
</script>
</body>
</html>