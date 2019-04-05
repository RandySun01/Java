package cn.edu.hnnu.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {
	//像页面写
	public static void write(HttpServletResponse response, Object o)throws Exception{
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print(o.toString());
		out.flush();
		out.close();
	}
}
