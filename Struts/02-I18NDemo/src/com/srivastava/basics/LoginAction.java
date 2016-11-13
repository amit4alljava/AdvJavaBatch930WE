package com.srivastava.basics;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
	private String messagetxt;
	private User user = new User();
	/*private String userid;
	private String password;
	*/
	private List<User> userList = new ArrayList<User>();
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

/*public String getUserid() {
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

*/	public String getMessagetxt() {
		return messagetxt;
	}

	public void setMessagetxt(String messagetxt) {
		this.messagetxt = messagetxt;
	}
	
	private void prepareUsers(){
	User user = new User();
	user.setUserid("ram");
	user.setPassword("123");
	user.setEmailId("ram@yahoo.com");
	user.setAddress("Delhi");
	userList.add(user);
	
	user = new User();
	user.setUserid("mike");
	user.setPassword("123");
	user.setEmailId("mike@yahoo.com");
	user.setAddress("LA");
	userList.add(user);
	
	user = new User();
	user.setUserid("mike");
	user.setPassword("123");
	user.setEmailId("mike@yahoo.com");
	user.setAddress("NY");
	userList.add(user);
	
	}
	
	public String execute(){
		this.prepareUsers();
		this.setMessagetxt("Hello User this is a Text");
		return SUCCESS;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
