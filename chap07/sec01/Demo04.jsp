<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>闭包</title>
</head>
<body>
<script type="text/javascript">
		var name="The Window";
		var object ={
				  name:"My object",
				  getNameFunc: function(){
					  var name="object func";
					  return function(){
						return  name;  
					  };
				  }
		};
		
		alert(object.name); 
		alert(object.getNameFunc()() );
</script>
</body>
</html>