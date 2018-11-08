package com.web.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.web.entity.*;
import com.web.entity.*;
import com.web.db.*;

public class Services {
	private DbConntion dbconnection;
	private Statement sta;
	private ResultSet rs;
	private String sql,sql1;
	private int flag,flag1,flag2,flag3,flag4,flag5,flag6,flag7;
	private List list;
	private String aname;
	
	
	public int regeditUser(Users users) throws SQLException{
		dbconnection = new DbConntion();
		sta=((ResultSet) dbconnection).getStatement();
//		System.out.println(users.getSex());
		sql="insert into users(username,password,age,sex,address,tel) values ('"+users.getUsername()+"','"+users.getPassword()+"','"+users.getAge()+"','"+users.getSex()+"','"+users.getAddress()+"','"+users.getTel()+"')";
		
		try {
			flag=sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
	
	

	
	public boolean login(String username,String password) throws SQLException{
		boolean b=false;
		dbconnection=new DbConntion();
		sta=((ResultSet) dbconnection).getStatement();
		sql="select * from admin";
		try {
			rs=sta.executeQuery(sql);
			tag:
			while(rs.next()){
				String aname=rs.getString("aname");
				String apass=rs.getString("password");
				
				if(aname.equals(username)&&apass.equals(password)){
					System.out.println("success");
					b=true;
					break tag;
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	public int Adduser(com.web.entity.Admins admins) {
		// TODO Auto-generated method stub
		return 0;
	}


public int addAdmin(Admins admins) throws SQLException{
	dbconnection = new DbConntion();
	sta=((ResultSet) dbconnection).getStatement();
	sql="insert into admin(aname,password)values('"+admins.getAname()+"','"+admins.getPassword()+"')";
	
	try {
		flag1=sta.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return flag1;
}


public int deleteAdmin(String aid) throws SQLException{
	dbconnection= new DbConntion();
	sta=((ResultSet) dbconnection).getStatement();
	sql1="delete admin where aid='"+aid+"'";
	System.out.println(sql1);
	try {
		flag3=sta.executeUpdate(sql1);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(flag3);
	return flag3;
}


public List getAllAdmin() throws SQLException{
	list= new ArrayList();
	dbconnection=new DbConntion();
	sta=((ResultSet) dbconnection).getStatement();
	sql="select * from admin";
	
	try {
		rs=sta.executeQuery(sql);
		while(rs.next()){
			Admins admins = new Admins();
//System.out.println(rs.getString("aname"));
			admins.setAid(rs.getString("aid"));
			admins.setAname(rs.getString("aname"));
			admins.setPassword(rs.getString("password"));
			list.add(admins);
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	return list;
}


public String getAdminName(String aid) throws SQLException{
	System.out.println(aid);
	dbconnection=new DbConntion();
	sta=((ResultSet) dbconnection).getStatement();
	String sql="select aname from admin where aid='"+aid+"'";
	
	System.out.println(sql);
	try {
		rs=sta.executeQuery(sql);
		while(rs.next()){
			aname=rs.getString("aname");
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return aname;
}


public int editAdminPass(String aid,String password) throws SQLException{
	System.out.println(aid);
	dbconnection= new DbConntion();
	sta=((ResultSet) dbconnection).getStatement();
	
	sql="update admin set password='"+password+"' where aid='"+aid+"'";
	
	System.out.println(sql);
	try {
		flag2=sta.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("flag2="+flag2);
	
	return flag2;
}

public List getAllOrders() throws SQLException{
	list= new ArrayList();
	dbconnection=new DbConntion();
	sta=((ResultSet) dbconnection).getStatement();
	sql="select * from orders";
	
	try {
		rs=sta.executeQuery(sql);
		while(rs.next()){
			Orders orders = new Orders();

			orders.setOrderid(rs.getString("orderid"));
			orders.setPid(rs.getString("pid"));
			orders.setCount(rs.getString("count"));
			orders.setTypeid(rs.getString("typeid"));
			orders.setUsername(rs.getString("username"));
			orders.setAddress(rs.getString("address"));
			orders.setName(rs.getString("name"));
			orders.setTel(rs.getString("tel"));
			orders.setCode(rs.getString("code"));
			list.add(orders);
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	return list;
	}


public int addProduct(String pname,String ptype,String pinfo) throws SQLException{
	
dbconnection=new DbConntion();
sta=((ResultSet) dbconnection).getStatement();
sql="insert into product(pname,ptype,pinfo) values('"+pname+"','"+ptype+"','"+pinfo+"')";
System.out.println(sql);
	try {
		flag6=sta.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return flag6;
}


public List getAllProduct() throws SQLException{
	list= new ArrayList();
	dbconnection=new DbConntion();
	sta=((ResultSet) dbconnection).getStatement();
	sql="select * from product";
	
	try {
		rs=sta.executeQuery(sql);
		while(rs.next()){
			Product product = new Product();

			product.setPid(rs.getString("pid"));
			product.setPname(rs.getString("pname"));
			product.setPtype(rs.getString("ptype"));
			product.setPinfo(rs.getString("pinfo"));
			list.add(product);
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	return list;
}


public int deleteProduct(String pid) throws SQLException{
	dbconnection= new DbConntion();
	sta=((ResultSet) dbconnection).getStatement();
	sql="delete product where pid='"+pid+"'";
	System.out.println(sql);
	try {
		flag7=sta.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println(flag7);
	return flag7;
	}

public int addType(String typename) throws SQLException{
	
	dbconnection=new DbConntion();
	sta=((ResultSet) dbconnection).getStatement();
	sql="insert into type(typename) values('"+typename+"')";
	System.out.println(sql);
		try {
			flag4=sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag4;
	}
	
	
	public List getAllType() throws SQLException{
		List list=new ArrayList();
		dbconnection=new DbConntion();
		sta=((ResultSet) dbconnection).getStatement();
		sql="select * from type";
		try {
			rs=sta.executeQuery(sql);
			while(rs.next()){
				Types types =new Types();
				types.setTypeid(rs.getString("typeid"));
				types.setTypename(rs.getString("typename"));
				list.add(types);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public int deleteType(String typeid) throws SQLException{
		dbconnection= new DbConntion();
		sta=((ResultSet) dbconnection).getStatement();
		sql="delete type where typeid='"+typeid+"'";
		System.out.println(sql);
		try {
			flag5=sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(flag5);
		return flag5;
	}
}
	


