第一章 JDBC 概述  
	第一节：JDBC 简介  
		JDBC（Java Data BaseConnectivity，java 数据库连接）是一种用于执行 SQL 语句的 JavaAPI，可以为多种关系  
		数据库提供统一访问，它由一组用 Java 语言编写的类和接口组成。JDBC 提供了一种基准，据此可以构建更高   
		级的工具和接口，使数据库开发人员能够编写数据库应用程序。  
	第二节：JDBC 原理  
		JDBC 原理：JDBC 是以前 SUN 公司定义的一套访问数据库的接口（没有具体实现），一套标准，  
		具体的实现是由 各大数据库厂家去实现，每个数据库厂家都有自己的 JDBC 实现，也就是 JDBC 驱动实现类，  
		Java 应用程序连接 指定数据库，需要使用厂家提供的 JDBC 驱动才能连接。（这里其实就是 java 多态的一种体现，一个接口可以有 很多具体的实现）  
第二章 JDBC 连接数据库  
	第一节：JDBC 连接数据库步骤  
		第一步：加载驱动；  
		第二步：连接数据库；   
		第三步：使用语句操作数据库；   
		第四步：关闭数据库连接，释放资源；  
	第二节：在项目里配置数据库驱动
		右击项目 -> BuildPath -> Configure BuildPath->AddExteranl JARs...  
	第三节：加载数据驱动  
		Mysql 驱动名：com.mysql.jdbc.Driver   
		加载方式： Class.forName(驱动名)； Ctrl+1  
	第四节：连接及关闭数据库  
		1，DriverManager 驱动管理类，主要负责获取一个数据库的连接；   
    	    	  static ConnectiongetConnection(String url, Stringuser,String password) 试图建立到给定数据库 URL 的连 接。  
		2，MySQL 数据库的连接地址格式 jdbc:mysql://IP 地址:端口号/数据库名称   
		  jdbc 协议：JDBC URL 中的协议总是 jdbc ；   
		子协议：驱动程序名或数据库连接机制（这种机制可由一个或多个驱动程序支持）的名称，如 mysql；   
		子名称：一种标识数据库的方法。必须遵循“//主机名：端口/子协议”的标准 URL 命名约定，如 //localhost:3306/db_book  
		3，Connection 接口 与特定数据库的连接（会话）。  
     		void close()   
         		立即释放此 Connection 对象的数据库和 JDBC 资源，而不是等待它们被自动释放。  
第三章 使用 Statement 接口实现增，删，改操作  
	第一节：Statement 接口引入  
		作用：用于执行静态 SQL 语句并返回它所生成结果的对象。  
		int  executeUpdate(String sql) 执行给定 SQL 语句，该语句可能为 INSERT、UPDATE 或 DELETE 语句，或 者不返回任何内容的 SQL 语句（如 SQLDDL 语句）。   
		void  close() 立即释放此 Statement 对象的数据库和 JDBC 资源，而不是等待该对象自动关闭时发生此操作。  
	第二节：使用 Statement 接口实现添加数据操作   
	第三节：使用 Statement 接口实现更新数据操作   
	第四节：使用 Statement 接口实现删除数据操作  
第四章 使用 PreparedStatement 接口实现增，删，改操作  
	第一节：PreparedStatement 接口引入  
		PreparedStatement 是 Statement 的子接口，属于预处理操作，与直接使用 Statement 不同的是，  
		PreparedStatement 在操作时，是先在数据表中准备好了一条 SQL 语句，但是此 SQL 语句的具体内容暂时不设置，  
		而是之后再进 行设置。 （以后开发一般用 PreparedStatement，不用 Statement）  
	第二节：使用 PreparedStatement 接口实现添加数据操作   
	第三节：使用 PreparedStatement 接口实现更新数据操作   
	第四节：使用 PreparedStatement 接口实现删除数据操作  
第五章 ResultSet 结果集  
	第一节：ResultSet 结果集的引入  
		当我们查询数据库时，返回的是一个二维的结果集，我们这时候需要使用 ResultSet 来遍历结果集，  
		获取每一行 的数据。  
	第二节：使用 ResultSet 遍历查询结果  
		boolean next() 将光标从当前位置向前移一行。   
		String   getString(int columnIndex) 以 Java 编程语言中 String 的形式获取此 ResultSet 对象的当前行中指定列 的值。  
 		String   getString(String columnLabel) 以 Java 编程语言中 String 的形式获取此 ResultSet 对象的当前行中指 定列的值  
第六章 处理大数据对象  
	大数据对象处理主要有 CLOB（characterlarge object）和 BLOB（binary large object）两种类型的字段；  
	在 CLOB 中可以存储大字符数据对象，比如长篇小说；在 BLOB 中可以存放二进制大数据对象，比如图片，电影，音乐；  
	第一节：处理 CLOB 数据  
	第二节：处理 BLOG 数据   
	第七章 使用 CallableStatement 接口调用存储过程  
	第一节：CallableStatement 接口的引入  
		CallableStatement 主要是调用数据库中的存储过程，CallableStatement 也是 Statement 接口的子接口。  
		在使用 CallableStatement 时可以接收存储过程的返回值。  
	第二节：使用 CallableStatement 接口调用存储过程   		   
		void  registerOutParameter(int parameterIndex, intsqlType)  
 		按顺序位置 parameterIndex 将 OUT 参数注册为 JDBC 类型 sqlType。   
第八章 使用元数据分析数据库   
	第一节：使用 DatabaseMetaData 获取数据库基本信息  
		DatabaseMetaData   可以得到数据库的一些基本信息，包括数据库的名称、版本，以及得到表的信息。   
		String getDatabaseProductName()   获取此数据库产品的名称。  
		int getDriverMajorVersion()   获取此 JDBC 驱动程序的主版本号。   
		int getDriverMinorVersion()   获取此 JDBC 驱动程序的次版本号。  
	第二节：使用 ResultSetMetaData   获取 ResultSet 对象中的信息  
		ResultSetMetaData   可获取关于 ResultSet 对象中列的基本信息；   
		int  getColumnCount()   返回此 ResultSet 对象中的列数。   
		String  getColumnName(int column)   获取指定列的名称。  
 		int  getColumnTypeName(int column)   获取指定列的 SQL 类型名称。  

第九章 JDBC 事务处理  
	第一节：事务的概念   
		事务处理在数据库开发中有着非常重要的作用，所谓事务就是所有的操作要么一起成功，要么一起失败，事务   
		本身具有原子性（Atomicity）、一致性（Consistency）、隔离性或独立性（Isolation） 、持久性（Durability）  
		4 个特 性，这 4 个特性也被称为 ACID 特征。    
		原子性：原子性是事务最小的单元，是不可再分隔的单元，相当于一个个小的数据库操作，这些操作必须同时   
		成功，如果一个失败了，则一切的操作将全部失败。   
		一致性：指的是在数据库操作的前后是完全一致的，保证数据的有效性，如果事务正常操作则系统会维持有效 性，  
		如果事务出现了错误，则回到最原始状态，也要维持其有效性，这样保证事务开始时和结束时系统处于一 致状态。   
		隔离性：多个事务可以同时进行且彼此之间无法访问，只有当事务完成最终操作时，才可以看到结果；  
 		持久性：事务完成之后，它对于系统的影响是永久性的。该修改即使出现致命的系统故障也将一直保持。  
	第二节：MySQL 对事务的支持  
		序号	       命令 					                      描述
		 1	   SETAUTOCOMMIT=0 		                取消自动提交处理，开启事务处理 
		 2 	  SETAUTOCOMMIT=1 	  	              打开自动提交处理，关闭事务处理 
		 3 	  STARTTRANSACTION 		                启动事务 
		 4 	  BEGIN 			      	                启动事务，相当于执行 STARTTRANSACTION 
		 5 	  COMMIT 				                      提交事务 
		 6 	  ROLLBACK 			                      回滚全部事务
		 7 	  SAVEPOINT 事务保存点名称		          设置事务保存点
		 8    ROLLBACK TO SAVEPOINT保存点名称	    回滚操作到保存点
	第三节：JDBC 事务处理
	第四节：事务保存点
