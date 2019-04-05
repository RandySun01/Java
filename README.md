第一章 认识 Ajax   
	第一节：Ajax 简介  
		1，Ajax 是一种网页开发技术，（AsynchronousJavascript +XML）异步 JavaScript 和 XML；  
		2，Ajax 是异步交互，局部刷新；   
		3，Ajax 能减少服务器压力；   
		4，Ajax 能提高用户体验；  
  
	第二节：Ajax 交互与传统交互比较  
		传统交互：网页整体刷新，服务器压力大，用户体验不好； Ajax 交互：局部刷新，服务器压力小，用户体验好；  
第二章 Ajax 核心知识  
    
	第一节：XMLHttpRequest 对象创建  
		所有现代浏览器均支持 XMLHttpRequest 对象（IE5 和 IE6 使用 ActiveXObject） 。  
		XMLHttpRequest 用于在后台与服务器交换数据。这意味着可以在不重新加载整个网页的情况下，对网页的某 部分进行更新。  
  
	第二节：XMLHttpRequest 对象请求后台  
		open(method,url,async) 规定请求的类型、URL 以及是否异步处理请求。   
		method：请求的类型；GET 或 POST   
		url：文件在服务器上的位置   
		async：true（异步）或 false（同步）  
  
		send(string) 将请求发送到服务器。   
		string：仅用于 POST 请求  

		GET 还是 POST？    
		与 POST 相比，GET 更简单也更快，并且在大部分情况下都能用。   
		然而，在以下情况中，请使用 POST 请求： 
		无法使用缓存文件（更新服务器上的文件或数据库）  
		向服务器发送大量数据（POST 没有数据量限制）   
		发送包含未知字符的用户输入时，POST 比 GET 更稳定也更可靠  
  
		setRequestHeader(header,value) 向请求添加 HTTP 头。  
		 header: 规定头的名称 value: 规定头的值  
  
		xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");  
		异步 -True 或 False？   
		AJAX 指的是异步 JavaScript 和 XML（AsynchronousJavaScript andXML）。   
		为 True 的话，表示的是异步，异步表示程序请求服务器的同时，程序可以继续执行；能提高系统的运行效率；   
		为 False 的话，表示同步，JavaScript 会等到服务器响应就绪才继续执行。如果服务器繁忙或缓慢，应用程序会 挂起或停止。   
		我们一般都是用 True  
  
	第三节：XMLHttpRequest 对象响应服务器   
		onreadystatechange 事件   
		当请求被发送到服务器时，我们需要执行一些基于响应的任务。   
		每当 readyState 改变时，就会触发 onreadystatechange 事件。   
		readyState 属性存有 XMLHttpRequest 的状态信息。   
		下面是 XMLHttpRequest 对象的三个重要的属性：   
		onreadystatechange存储函数（或函数名），每当 readyState 属性改变时，就会调用该函数。  
		readyState 存有 XMLHttpRequest 的状态。从 0 到 4 发生变化。   
		0: 请求未初始化   
		1: 服务器连接已建立   
		2: 请求已接收  
		3: 请求处理中   
		4: 请求已完成，且响应已就绪   
		status 200:"OK"   
		404: 未找到页面   
		在 onreadystatechange 事件中，我们规定当服务器响应已做好被处理的准备时所执行的任务。  
		如需获得来自服务器的响应，请使用 XMLHttpRequest 对象的 responseText 或 responseXML 属性。   
		属性 描述 responseText 获得字符串形式的响应数据。   
		responseXML 获得 XML 形式的响应数据。（了解即可）  
第三章  认识Json  
	第一节：Json 引入  
		JSON：JavaScript 对象表示法（JavaScriptObjectNotation） 。   
		JSON 是存储和交换文本信息的语法。类似 XML。  
		JSON 比 XML 更小、更快，更易解析  
	第二节：Json 格式语法  
		JSON 对象 ：  
		{"name":"张三","age":22}  

		JSON 数组	：  
		 { "student": [  
			 {"name":"张三","age":22},   
			{"name":"李四","age":23},   
			{"name":"王五","age":24}   
			]  
		 }  
  
		JSON 嵌套：  
		 { "student": [   
			{"name":"张三","age":22,"score":{"chinese":90,"math":100,"english":80}},   
			{"name":"李四","age":23,"score":{"chinese":70,"math":90,"english":90}},  
			 {"name":"王五","age":24,"score":{"chinese":80,"math":60,"english":90}}   
			 ]  
		 }  

		把 Json 串换成 Json 对象  
		vardataObj=eval("("+data+")");//转换为 json 对象  
  
	第三节：Json 第三方 jar 包引入  
		Json-lib  
	第四节：Ajax&Json 交互简单实例  

第四章 Ajax 交互实例  
	第一节：Ajax 验证用户名   
	第二节：Ajax 二级联动  
