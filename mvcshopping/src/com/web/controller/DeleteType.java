package com.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.service.Services;

public class DeleteType extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DeleteType() {
		super();
	}
	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String typeid=request.getParameter("typeid");
		Services service=new Services();
		int flag = 0;
		try {
			flag = service.deleteType(typeid);
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
