package cn.edu.hnnu.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonUtil {
	
	/**
	 * 把ResultSet 集合转换成JsonArray数组
	 * @param rs
	 * @return
	 * @throws Exception
	 */
	public static JSONArray fonrmatResToJsonArray(ResultSet rs)throws Exception{
		// resultset ===>jsonarray
		// 数目
		ResultSetMetaData md = rs.getMetaData();
		int num = md.getColumnCount();
		JSONArray array = new JSONArray();
		while(rs.next()){
			JSONObject mapOfColValues = new JSONObject();
			for(int i = 1; i <= num; i++){
				mapOfColValues.put(md.getColumnName(i), rs.getObject(i));				
			}
			array.add(mapOfColValues);
		}
		// System.out.println(array);
		return array;
		
	}

}
