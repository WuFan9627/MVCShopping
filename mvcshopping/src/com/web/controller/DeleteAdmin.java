package com.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.service.Services;

public class DeleteAdmin extends HttpServlet {
	public DeleteAdmin() {
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
		
		String aid=request.getParameter("id");
		
		System.out.println(aid);
		
		Services service = new Services();
		int flag = 0;
		try {
			flag = service.deleteAdmin(aid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(flag==1){
			System.out.println("success");
			response.sendRedirect("../Success.jsp");
		}else{
			System.out.println("fail"); 
			response.sendRedirect("../False.jsp");
		}
		
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
