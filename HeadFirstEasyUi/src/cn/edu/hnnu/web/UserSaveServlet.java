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
import cn.edu.hnnu.model.User;
import cn.edu.hnnu.util.DBUtil;
import cn.edu.hnnu.util.ResponseUtil;
import cn.edu.hnnu.util.StringUtil;

public class UserSaveServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		 String name = request.getParameter("name");
		 String phone = request.getParameter("phone");
		 String email = request.getParameter("email");
		 String qq = request.getParameter("qq");
		 String id = request.getParameter("id");
		 DBUtil dbUtil = new DBUtil();
		 UserDao userDao = new UserDao();
		 Connection con = null;
		 
		 User user = new User(name, phone, email, qq);
		 if(StringUtil.isNoEmpty(id)){
			 user.setId(Integer.parseInt(id));
			 
		 }
		 try {
			 int saveNumes = 0;
			con = dbUtil.getCon();
			if(StringUtil.isNoEmpty(id)){
				saveNumes = userDao.userModify(con, user);
			}else{
				saveNumes = userDao.userAdd(con, user);
			}
			JSONObject result = new JSONObject();
			if(saveNumes == 1){
				result.put("success", "true");
			}else{
				result.put("errorMsg", "保存失败");
			}
			result.put("data", user);
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
