package com.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.entity.Users;
import com.web.service.Services;

public class Regedit extends HttpServlet {

	public Regedit() {
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
			username=new String(username.getBytes("ISO8859-1"),"GBK");
		String password=request.getParameter("password");
		String age=request.getParameter("age");
		String sex=request.getParameter("sex");
			sex=new String(sex.getBytes("ISO8859-1"),"GBK");
		String address=request.getParameter("address");
			address=new String(address.getBytes("ISO8859-1"),"GBK");
		String tel=request.getParameter("tel");
		
//		System.out.println(username);
		
		com.web.entity.Users users=new com.web.entity.Users();
		users.setUsername(username);
		users.setPassword(password);
		users.setAge(age);
		users.setAddress(address);
		users.setSex(sex);
		users.setTel(tel);
		
		Services service = new Services();
		int flag = 0;
		try {
			flag = service.regeditUser(users);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag==1){
			System.out.println("success");
		}else{
			System.out.println("עfail");
		}
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
