package com.srivastava.basics;

import com.opensymphony.xwork2.ActionSupport;

// Action class contains the Business Logic 
// It has the setter and getter and it treated as POJO Class.
// It is POJO so it can test easily with out start the server.
public class HelloAction {//extends ActionSupport {
	private String userid;
	private String password;
	private String message;
	
	public String execute(){
		// It Contains the Business Logic...
		// Either Call some Business Logic from Here
		// It is used to prepare the data for the View
		this.setMessage("Hello JSP");
		return "success";
	}
	
	public String checkLogin(){
		String result = "error";
		if(this.getUserid().equals(this.getPassword())){
			this.setMessage("Welcome "+this.getUserid());
			result = "login";
		}
		else
		{
			this.setMessage("Invalid Userid or Password");
		}
		return result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
