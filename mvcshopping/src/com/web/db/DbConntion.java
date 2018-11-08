package com.web.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConntion {
	public DbConntion(){
		driver="com.mysql.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/system";
		dbusername="root";
		dbpassword="83hx9845";
		this.getConection();
	}
	
	private String driver;
	private String url;
	private String dbusername;
	private String dbpassword;
	private Connection con;
	private Statement sta;
	private ResultSet rs;
	
	
	public Connection getConection(){
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,dbusername,dbpassword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
	
	
	public Statement getStatement(){
		try {
			sta=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sta;
	}
}
