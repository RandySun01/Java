第一章 问候 JavaScript   
	第一节：JavaScript 简介  
		百度百科：JavaScript   
		JavaScript  
	第二节：问候 JavaScript   
第二章 JavaScript 基本语法  
	第一节：JavaScript 引入方式  
		内部；外部；  
	第二节：JavaScript 注释  
		单行： // ； 多行： /* */ ；  
	第三节：JavaScript 变量  
		JavaScript 是弱类型语言，统一用 var 来定义变量；  
	第四节：JavaScript 基本数据类型  
		数值类型；  
		字符串类型；  
		布尔类型；  
		Undefined(表示变量不含有值)   
		Null(置空变量)  
	第五节：JavaScript 运算符  
		1，算术运算符；  
		2，赋值运算符；  
		3，比较运算符；  
		4，逻辑运算符；  
		5，三目运算符；  
		6，字符串连接“+”  
	第六节：JavaScript 选择与循环语句  
		1，if...else 语句；  
		2，switch 语句；  
		3，for 循环语句；  
		4，while/do..while 语句；  
	第七节：JavaScript 函数   
	第八节：BreakVSContinue  
第三章 JavaScript 操作 DOM 节点  
	第一节：JavaScript 处理 DOM 事件    
	第二节：JavaScript 操作 DOM 节点  
		1，JavaScript 修改 DOM 节点   
		2，JavaScript 添加 DOM 节点   
		3，JavaScript 删除 DOM 节点  
	第三节：JavaScript 修改 DOM 节点 CSS 样式  
第四章 JavaScript 对象  
	第一节：JavaScript 对象  
		1，JavaScript 对象定义   
		2，JavaScript 动态的添加属性和方法   
		3，JavaScript 动态的删除属性和方法   
		4，JavaScript 对象构造方法  
	第二节：JavaScript 字符串对象  
		1，字符串对象实例化方法   
		2，字符串 length 属性   
		3，字符串 indexOf 方法 使用 indexOf() 来定位字符串中某一个指定的字符首次出现的位置   
		4，字符串 replace()方法 使用 replace() 方法在字符串中用某些字符替换另一些字符  
	第三节：JavaScript 日期对象  
		1，日期对象实例化   
		2，getTime()方法，返回 1970 年 1 月 1 日至今的毫秒数。   
		3，getFullYear() 从 Date 对象以四位数字返回年份。  
		4，getMonth() 从 Date 对象返回月份 (0~11)。  
		5，getDate() 从 Date 对象返回一个月中的某一天 (1~31)。  
		6，getHours() 返回 Date 对象的小时 (0~23)。  
		7，getMinutes() 返回 Date 对象的分钟 (0~59)。  
		8，getSeconds() 返回 Date 对象的秒数 (0~59)。  
		9，getDay() 从 Date 对象返回一周中的某一天 (0~6)。  
	第四节：JavaScript 数组  
		1，数组的声明；   
		2，数组的遍历；   
		3，数组元素排序 sort()方法；   
		4，数组元素组合成字符串 join()方法；   
		5，合并数组元素 concat()方法；   
		6，颠倒数组元素 reverse()方法；  
第五章 JavaScript 常用函数  
	第一节：JavaScript 全局函数  
		全局函数不属于任何一个内置对象。   
		JS 包含以下 7 个全局函数，  
		用于一些常用的功能：escape(),eval(),isNan(),isFinite(),parseFloat(),parseInt(),unescape();   
		Eval()方法：执行代码；  
	第二节：JavaScriptwindow 对象常用方法及事件  
		Alert();弹出消息框 confirm() prompt()   
		setTimeout()；执行一次   
		setinterval()；执行多次   
		open();打开窗口  
		Window.onload 发生在文档全部下载完毕的时候。  
		Window.onresize 发生在窗口大小发生变化的时候。  
第六章 Function 对象  
	第一节：Function 对象引入  
		Function 是 js 的方法对象，可以用 Function 实例化出任何 js 方法对象；  
	第二节：用 Function 创建方法对象   
	第三节：Function 对象属性   
	第四节：Function 对象方法  
第七章 JavaScript 闭包  
	第一节：Js 变量的作用域  
		各种专业文献上的“闭包” （closure）定义非常抽象，很难看懂。我的理解是，闭包就是能够读取其他函数内部 变量的函数。   
		由于在 Javascript 语言中，只有函数内部的子函数才能读取局部变量，因此可以把闭包简单理解成“定义在一个 函数内部的函数”。   
		所以，在本质上，闭包就是将函数内部和函数外部连接起来的一座桥梁。  
	第二节：从外部读取方法内部的局部变量  
	第三节：闭包的概念  
	第四节：闭包的用途  
		一个是前面提到的可以读取函数内部的变量，另一个就是让这些变量的值始终保持在内存中。  
	第五节：闭包的使用注意点  
		1）由于闭包会使得函数中的变量都被保存在内存中，内存消耗很大，所以不能滥用闭包，否则会造成网页的性 能问题，在 IE 中可能导致内存泄露。解决方法是，在退出函数之前，将不使用的局部变量全部删除。   
		2）闭包会在父函数外部，改变父函数内部变量的值。所以，如果你把父函数当作对象（object）使用，把闭包 当作它的公用方法（Public Method），把内部变量当作它的私有属性（private value），这时一定要小心，不要随 便改变父函数内部变量的值。  
第八章 JavaScript 面向对象实现  
	第一节：面向对象三大特征  
	第二节：JavaScript 自定义对象  
		创建对象方式：方式一，对象初始化器方式；方式二，构造函数方式；   
		对象属性定义：私有属性；对象属性；类属性；  
 		对象方法定义：私有方法；对象方法；类方法；  
	第三节：JavaScript 实现封装特性   
	第四节：JavaScript 实现继承特性  
		Apply() 实现属性和方法的继承；   
		Prototype 实现原型的继承  
	第五节：JavaScript 实现多态特性  
