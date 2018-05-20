package com.herokuuapp.angular.chatapp.domain;

public class User {
    private long userId;
    private String userFullName;
    private String userEmail;
    private String userPassword;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long userId, String userFullName, String userEmail, String userPassword) {
		super();
		this.userId = userId;
		this.userFullName = userFullName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
    
}
