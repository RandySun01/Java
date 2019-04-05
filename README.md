第一章 认识 Jsp&Servlet   
	第一节：Jsp 概述  
		百度百科：Jsp  
	第二节：B/SVSC/S  
		B/S 系统是 浏览器/服务器   
		C/S 系统是 客户端/服务器   
		B/SC/S 比较 瘦客户端，未来发展趋势；  
	第三节：B/S 运行原理  
	第四节：Tomcat 服务器简介及安  
		百度百科：Tomcat   
		Tomcat7 下载：http://www.java1234.com/a/javaziliao/kfgj/2013/0506/345.html  
	第五节：认识jsp  
第二章 Jsp 基础语法  
	第一节：page 指令介绍  
		Language : 用来定义要使用的脚本语言；  
		contentType：定义 JSP 字符的编码和页面响应的 MIME 类型；   
		pageEncoding：Jsp 页面的字符编码  
	第二节：scriptlet 标签  
		通过 scriptlet 标签我们可以在 Jsp 里嵌入 Java 代码；   
		第一种：<%! %> 我们可以在里面定义全局变量、方法、类；   
		第二种：<%%> 我们可以在里面定义局部变量、编写语句；   
		第三种：<%= %> 我们可以在里面输出一个变量或一个具体内容；  
	第三节：Jsp 注释  
		<!-- --> Html 注释 客户端可见   
		<%-- --%> Jsp 注释 客户端不可见   
		//java 单行注释   
		/* */ java 多行注释  
	第四节：Jsp 包含指令  
		<%@ includefile=”要包含的文件”%> 静态包含 先包含，后编译处理；   
		<jsp:includepage=”要包含的文件”> 动态包含 先编译处理，后包含；   
		以后开发用动态包含；  
	第五节：Jsp 跳转指令  
		<jsp:forward> <jsp:param value=””name=””>   
		</jsp:forward> 服务器内部跳转，可带参数；   
第三章 JSP 九大内置对象及四个作用域   
	第一节：Jsp 九大内置对象及四大作用域概述  
		在 Jsp 开发中，Jsp 提供了 9 个内置对象，这些内置对象将由容器为用户进行实例化，用户直接使用即可。  
		这个 9 个内置对象分别是：pageContext,request,response,session,application,config,out,page,exception；  
		常用的是前面 5 个，需要熟练掌握； 在 Jsp 开发中，可以保存数据，  
		Jsp 提供了四种数据保存范围；分别是 page,request,session,application;  
	第二节：Jsp 四大作用域  
		Page 范围：只在一个页面中保存数据； javax.servlet.jsp.PageContext(抽象类)   
		Request 范围：只在一个请求中保存数据； javax.servlet.http.HttpServletRequest(接口)   
		Session 范围：在一次会话范围中保存数据，仅供单个用户使用；javax.servlet.http.HttpSession(接口)   
		Application 范围：在整个服务器上保存数据，所有用户共享；javax.servlet.ServletContext(接口)  
	第三节：response 对象  
		Response 内置对象和 request 内置对象是相对应的，  
		response 内置对象用于响应客户请求，向客户端输出信息； javax.servlet.HttpServletResponse 接口   
		1，自动刷新应用   
		2，页面重定向应用 客户端跳转   
		3，操作 cookie 应用 postget 方法比较 post 放数据包里 get 放 Url 后面 get 数据量小，不安全；  
		4，cookie 和 session 的比较 cookie 信息是存客户端的，session 信息是存服务器的；  
	第四节：out 对象  
		Out 内置对象主要用来向客户端输出各种类型的数据，同时还可以管理应用服务器上的输出缓冲区。  
		所以 out 内 置对象的方法是向客户端输出数据和管理缓冲区； 底层 javax.servlet.jsp.JspWriter 抽象类  
	第五节：config 对象  
		Config 内置对象是 JSP 页面通过 JSP 容器进行初始化时被传递的对象。javax.servlet.ServletConfig 。  
		在 Servlet 初始化的时候，JPS 引擎通过 config 向它传递信息。这种信息可以是属性名和属性值匹配的参数，  
		也可以是通过 ServletContext 对象传递的服务器的有关信息；  
	第六节：exception 对象  
		Exception 内置对象用来处理 JSP 文件在执行时发生的所有异常，它是 java.lang.Throwable 类的一个对象。  
	第七节：pageContext 对象  
		pageContext 内置对象是一个比较特殊的对象。它相当于页面中所有对象功能的集合，  
		即使用它可以访问到本页面 中所有对象。pageContext 内置对象由 Jsp 容器创建并初始化，  
		pageContext 对象提供了对 JSP 页面所有对象及控件 的访问。  
第四章 JavaBean 组件  
	第一节：Javabean 组件引入  
		JavaBean 是使用 Java 语言开发的一个可重用的组件，在 JSP 开发中可以使用 JavaBean 减少重复代码，  
		使整个 JSP 代码的开发更简洁。  
	第二节：jsp:useBean 创建 javabean  
		<jsp:useBeanid="实例化对象名称"scope="保存范围"class="类完整名称"/> Scope，  
		一共有 page,request,session 和 application4 个属性范围，默认是 page；  
	第三节：jsp:setProperty 设置 javabean 属性值  
		<jsp:setPropertyproperty="属性名称"name="实例化对象的名称"value="属性值"param="参数名称"/>   
		Property=”*” 自动匹配所有  
	第四节：jsp:getProperty 获取 javabean 属性值  
		<jsp:getPropertyproperty="属性名称"name="实例化对象的名称"/>  
	第五节：javabean 的保存范围  
		Javabean 的保存范围有 page,request,session.application，默认是 page  
	第六节：javabean 删除  
		Page 范围：pageContext.removeAttribute(“javaBeanName”);   
		request 范围：request.removeAttribute(“javaBeanName”);   
		session 范围：session.removeAttribute(“javaBeanName”);   
		application 范围：application.removeAttribute(“javaBeanName”);  
第五章 Servlet 开发  
	第一节：servlet 引入  
		百度百科：servlet  
	第二节：问候 servlet 他大爷 第三节：servlet 生命周期：  
		问候 servlet 他大爷   
	第四节：客户端跳转 VS 服务器端跳转  
		1，在 Servlet 中获取 session,application    
		2，客户端跳转 response.sendRedirect("目标地址");  
		3，服务器跳转：RequestDispatcherrd=request.getRequestDispatcher("目标地址"); rd.forward(request,response);  
	第五节：Jsp&Servlet 用户登录功能实现   
	第六节：Servlet 过滤器  
 		过滤用户请求；  
	第七节：Servlet 监听器  
		监听 web 事件；如 application,session,request  
第六章 EL 表达式  
	第一节：EL 表达式简介  
		表达式语言（ExpressionLanguage，EL）  
		百度百科：el 表达式  
	第二节：EL 表达式内置对象  
	序号	表达式内置对象 			说明  
	1 	pageContext 		   表示 javax.servlet.jsp.PageContext 对象   
	2	  pageScope 		     表示从 page 属性范围查找输出属性   
	3 	requestScope 		   表示从 request 属性范围查找输出属性   
	4 	sessionScope 		   表示从 session 属性范围查找输出属性   
	5 	applicationScope 	 表示从application属性范围查找输出属性  
	6 	param 			       接收传递到本页面的参数  
	7 	paramValues		     接收传递到本页面的一组参数   
    8 	header 			     取得一个头信息数据   
	9 	headerValues 		   取出一组头信息数据 1  
	0 	cookie 			       取出 cookie 中的数据  
	11 	initParam			     取得配置的初始化参数  
	第三节：EL 表达式访问 4 种范围属性  
		寻找值的顺序：page->request->session->application  
	第四节：EL 表达式接收请求参数  
		Param：单个参数  
 		paramValues：一组参数  
	第五节：EL 表达式对象操作   
	第六节：EL 表达式集合操作  
	第七节：EL 表达式运算符操作  
		算数运算符，  
		关系运算符，  
		逻辑运算符；   
		三目运算符；   
		Empty 关键字；  
第七章 Jsp 自定义标签  
	第一节：Jsp 自定义标签简介  
		百度百科：自定义标签  
	第二节：问候自定义标签他大爷  
	第三节：自定义有属性的标签  
	第四节：自定义有标签体的标签  
	第五节：简单标签  
第八章 Jsp 标准标签库  
	第一节：JSTL 引入  
		JSTL（JSPStandardTagLibrary ，JSP 标准标签库)   
		百度百科：JSTL  
	第二节：认识JSTL   
		第三节：JSTL 核心标签库  
		c:out 内容输出标签；   
		c:set 用来设置 4 中属性范围值的标签；   
		c:remove 用来删除指定范围中的属性；   
 		c:catch 用来处理程序中产生的异常；   
		c:if 用来条件判断；   
		c:choose、c:when、c:otherwise 用来多条件判断；   
		c:forEach 用来遍历数组或者集合；   
		c:fortokens 分隔输出；   
		c:import 导入页面；   
		c:url 生成一个 url 地址；   
		c:redirect 客户端跳   
	第四节：JSTL 国际化标签库  
		fmt:setLocale 设定用户所在的区域；   
		fmt:formatDate 对日期进行格式化；   
		fmt:requestEncoding 设置所有的请求编码；   
    fmt:bundlefmt:message 读取国际化资源；   
		fmt:formatNumber 格式化数字；   
		fmt:formatDate 格式化日期；   
		fmt:timeZone 设置临时时区；   
	第五节：JSTLSQL 标签库    
		Sql:setDataDource 设置 JDBC 连接;   
		sql:query 数据库查询操作；  
		Sql:update 数据库添加，修改，删除操作；   
		Sql:transaction 数据库事务；  
	第六节：JSTLXML 标签库  
		x:parse 解析 xml；  
		x:out 输出 xml 文件的内容；   
		x:set 把 xml 读取的内容保存到指定的属性范围；  
		x:if 判断指定路径的内容是否符合判断的条件；   
		x:choosex:whenx:otherwi  
	第七节：JSTL 函数标签库  
