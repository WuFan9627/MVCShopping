package com.web.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.common.Data;
import com.web.service.Services;

public class EditProduct extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public EditProduct() {
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

		Services services=new Services();
		List list = null;
		try {
			list = services.getAllProduct();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getSession().setAttribute(Data.PRODUCT, list);
		response.sendRedirect("../editProduct.jsp");
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
