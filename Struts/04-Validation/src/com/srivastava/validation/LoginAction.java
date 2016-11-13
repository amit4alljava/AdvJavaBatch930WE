package com.srivastava.validation;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String userid;
	private String name;
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute()
	{
		return SUCCESS;
	}
	
	@Override
	public void validate()
	{
		if(this.getUserid().length()==0)
		{
			this.addFieldError("userid", this.getText("loginform.useriderror"));
		}
		if(this.getName().length()==0)
		{
			this.addFieldError("name", this.getText("loginform.nameerror"));
		}
	}
}
