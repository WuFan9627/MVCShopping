package com.web.entity;

import java.io.Serializable;

public class Product implements Serializable{
	private String pid;
	private String pname;
	private String ptype;
	private String pinfo;
	private String price;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPinfo() {
		return pinfo;
	}
	public void setPinfo(String pinfo) {
		this.pinfo = pinfo;
	}
	public String getprice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	}
}
