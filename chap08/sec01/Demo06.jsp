<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title> 多态</title>
</head>
<body>

<script type="text/javascript">
	function Animal(){
		  
		 this.say = function(){
			 alert("动物");
		 };
	}	
	function People(){
		this.say=function(){
			alert("我是人");
		};
	}
	People.prototype = new Animal();
	function People1(){
		this.say=function(){
			alert("我是白人");
		};
	}
	People1.prototype = new Animal();
	function say(animal){
		if(animal instanceof Animal){
			animal.say();
		}
	}
	
	var people = new People();
	var	 people1 = new People1();
	say(people);
	say(people1);
	
</script>
</body>
</html>