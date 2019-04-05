package cn.edu.hnnu.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 连接数据库
 * @author sunrongzhi
 *
 */
public class DBUtil {
	private String dbUrl = "jdbc:mysql://localhost:3306/db_easyui";
	private String dbUserName = "root";
	private String dbPassword = "123456";
	private String dbDrivate = "com.mysql.jdbc.Driver";
	/**
	 * 连接数据库
	 */
	public  Connection getCon()throws Exception{
		Class.forName(dbDrivate);
		Connection con =  DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	
	public void closeCon(Connection con)throws Exception{
		if (con != null) {
			con.close();
			
		}
	}

}
