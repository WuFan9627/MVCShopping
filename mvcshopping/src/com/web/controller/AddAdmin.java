package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.entity.*;
import com.web.service.Services;

public class AddAdmin extends HttpServlet {
  
	private static final long serialVersionUID = 1L;

	public AddAdmin(){
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
		
		String aname=request.getParameter("aname");
		String password=request.getParameter("password");
		
		Admins admins=new Admins();
		admins.setAname(aname);
		admins.setPassword(password);
		
		Services services = new Services();
		int flag=services.Adduser(admins);
		
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
