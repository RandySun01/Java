第一章 问候 html   
	第一节：神马是 Web  
		用户通过浏览器请求服务器，服务器根据用户的请求，响应用户，用户浏览器显示的网页就是服务器相应的内容。 本视频主要讲解的是 Html 网页；动态网页到后面讲；  
	第二节：问候   
		开发工具 eclipse_j2ee 版  
		下载地址： http://pan.baidu.com/s/17W3AZ 32 位   
		http://pan.baidu.com/s/1xNhpw 64 位  
		HTML(Hyper Text Markup Language 超文本标记语言)是用来描述网页的一种语言。  
	第二章 用 HTML 设置文本  
	第一节：HTML 基本结构  
		<html> 标记放在 HTML 文件的开头，是一个形式上的标记；   
		<body> 标记称为主体标记，网页所要显示的内容都放在这个标记内，它是 HTML 文件的重要所在；  
		<head> 标记称为头标记，起的作用是放置关于此 HTML 文件的信息，如提供索引、定义 CSS 样式等；  
		<title> 标记称为标题标记，起的作用是设定网页标题；  
	第二节：文本排版  
		2.1 段落标签<p>   
		2.2 换行标签<br>   
		2.3 标题标签<h1>~<h6>   
		2.4 文字居中标签<center>  
		2.5 文字段落缩进标签<blockquote>  
	第三节：设置文字列表  
		文字列表的主要作用是有序地编排一些信息资源，使其结构化和条理化，并以列表的样式显示出来  
		3.1 无序列表 ul   
		3.2 有序列表 ol  
	第四节：HTML 标记与 HTML 属性  
		在大多数 HTML 标记中都可以对属性控制，属性的作用是帮助 HTML 标记进一步控制 HTML 文件的内容，  
		比如 内容的对齐方式（如本例），文字的大小、字体、颜色，网页的背景样式，图片的插入，等等。  
		其基本语法为： <标记名称 属性名 1=“属性值 1” 属性名 2=“属性值 2” ......>  
		4.1 用 align 属性控制段落的水平位置  
		4.2 用 bgcolor 属性设置背景颜  
			1，直接颜色表示 如 redblue ；  
			2，利用 R/G/B 表示 16 进制 #FFFF00 ；  
		4.3 设置文字的特殊样式  
		标记 			显示效果  
		<b></b> 		文字以粗体方式显示   
		<i></i> 			文字以斜体方式显示   
		<u></u> 		文字以加下划线方式显示   
		<s></s> 			文字以加下删除方式显示   
		<big></big> 		文字以放大方式显示   
		<small></small> 		文字以缩小方式显示  
		<strong></strong> 		文字以加强强调方式显示   
		<em></em> 		文字以强调方式显示   
		<address></address> 	用来显示电子邮件地址或网址   
		<code></code> 		用来说明代码与指令  
		4.4 设置文字的大小和颜色 font 标签  
	第五节：特殊文字符号  
		符号 		HTML 代码  
		< 		&lt;   
		> 		&gt;  
 		© 		&copy;   
		上标 		<sup></sup>   
		下标 		<sub></sub>  
第三章 在网页中使用图像 img  
	第一节：初识网页图片  
	第二节：相对路径 VS 绝对路径  
	第三节：设置图片的尺寸  
	第四节：用 alt 属性为图像设置替换文本 第五节：用 title 属性为图像设置标题  
第四章 用 HTML 建立超链接  
	第一节：基本文字超链接  
	第二节：设置图片的超链接  
	第三节：设置以新窗口显示链接页面  
	第四节：设置电子邮件链接  
	第五节：框架之间的链接  
		框架是一种常用的网页布局工具。它的作用是把浏览器的显示空间分割为几个部分，  
		每个部分都可以独立显 示不同的网页  
		5.1 用 cols 属性将窗口分为左右两部分   
		5.2 用 rows 属性将窗口分为上中下三部分   
		5.3 框架的嵌套   
		5.4 用 src 属性在框架中插入网页   
		5.5 框架之间建立链接  
	第六节：嵌入式框架 iframe  
第五章 用 HTML 创建表格  
	第一节：表格的基本结构  
		2.1 用 colspan 属性左右合并单元格   
		2.2 用 rowspan 属性上下合并单元格  
	第二节：合并单元格  
	第三节：用 align 属性设置对齐方式   
	第四节：用 bgcolor 属性设置表格背景色和边框颜色  
	第五节：用 cellpadding 属性和 cellspacing 属性设定边距  
		5.1cellspadding 属性设定表格单元格中的内容距离格线的距离   
		5.2cellspacing 属性设定表格相邻单元格边线之间的距离。  
第六章 HTML 表单  
	第一节：Form 表单  
		表单是一个包含表单元素的区域。主要作用就是向服务器提交数据  
	第二节：文本表单  
		1，文本框   
		2，密码框   
		3，文本域  
	第三节：单选框  
	第四节：复选框  
	第五节：下拉框  
	第六节：按钮  
		1，提交按钮  
		2，普通按钮  
	第七节：文件上传  
第七章 HTML 块  
	第一节：DIV  
		HTML<div> 元素是块级元素，它是可用于组合其他 HTML 元素的容器  
	第二节：SPAN  
		HTML<span> 元素是内联元素，可用作文本的容器。  
