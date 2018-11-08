package com.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.service.Services;

public class Login extends HttpServlet {
	public Login() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		Services service = new Services();
		boolean b = false;
		try {
			b = service.login(username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(b){
			response.sendRedirect("../adminIndex.jsp");
		}else{
			response.sendRedirect("../loginFalse.jsp");
		}
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
