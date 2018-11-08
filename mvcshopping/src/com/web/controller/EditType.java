package com.web.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.common.Data;
import com.web.service.Services;

public class EditType extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public EditType() {
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

		List list = new ArrayList();
		Services service=new Services();
		try {
			list=service.getAllType();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getSession().setAttribute(Data.TYPES, list);
		response.sendRedirect("../typeList.jsp");
	
	}
	public void init() throws ServletException {
		// Put your code here
	}

}
