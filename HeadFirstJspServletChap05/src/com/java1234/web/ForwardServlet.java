package com.java1234.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ForwardServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("requestKey", "requestֵ");
		HttpSession session=request.getSession();  // 获取session
		session.setAttribute("sessionKey", "sessionֵ");
		ServletContext application=this.getServletContext(); // 获取application
		application.setAttribute("applicationKey", "applicationֵ");
		RequestDispatcher rd=request.getRequestDispatcher("target.jsp");
		rd.forward(request, response); // 服务器跳转
	}
	
	

	
}
