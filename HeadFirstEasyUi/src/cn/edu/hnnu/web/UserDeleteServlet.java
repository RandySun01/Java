package cn.edu.hnnu.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import cn.edu.hnnu.dao.UserDao;
import cn.edu.hnnu.util.DBUtil;
import cn.edu.hnnu.util.ResponseUtil;

public class UserDeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		 
		 response.setCharacterEncoding("utf-8");
		 // 实现chap37crud1进行删除记录，获取delid
		 // String delId = request.getParameter("delId");
		// 实现chap37crud2进行删除记录,获取id
		 String delId = request.getParameter("id");
		 System.out.println(delId);
		 DBUtil dbUtil = new DBUtil();
		 UserDao userDao = new UserDao();
		 Connection con = null;
		 try {
			con = dbUtil.getCon();
			int delNums = userDao.userDelete(con, delId);
			JSONObject result = new JSONObject();
			if(delNums == 1){
				result.put("success", "true");
			}else{
				result.put("errorMsg", "删除失败");
			}
			ResponseUtil.write(response, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
	}
	
	

}
