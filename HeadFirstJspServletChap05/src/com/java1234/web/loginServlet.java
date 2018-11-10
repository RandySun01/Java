package com.java1234.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.hnnu.dao.UserDao;
import cn.edu.hnnu.model.User;
import cn.edu.hnnu.util.DbUtil;

public class loginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DbUtil dbUtil = new DbUtil();
	UserDao userDao = new UserDao();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
	}

	@Override   
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		 String userName = request.getParameter("userName");
		 String password = request.getParameter("password");
		 
		 Connection con = null;
		 try {
			User user =  new User(userName, password);
			con = dbUtil.getCon();
			User currentUser = userDao.login(con, user);
			if(currentUser == null){
				System.out.println("no");
				request.setAttribute("erro", "用户名或密码错误");
				request.setAttribute("userName", userName);
				request.setAttribute("password", password);
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}else{
				System.out.println("yes");
				HttpSession session = request.getSession();
				session.setAttribute("currentUser", currentUser);
				response.sendRedirect("main.jsp");
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
}
