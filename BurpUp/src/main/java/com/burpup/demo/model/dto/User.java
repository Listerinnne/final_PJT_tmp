package com.burpup.demo.model.dto;

public class User {
	private User user = new User();
	private User() {};
	
	public User getUser() {
		return user;
	}
	
	///////////////////////////////////////
	
	int userId;
	int userLoginId;
	String userName;
	int burpeeGoal;
	String userImg;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(int userLoginId) {
		this.userLoginId = userLoginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBurpeeGoal() {
		return burpeeGoal;
	}

	public void setBurpeeGoal(int burpeeGoal) {
		this.burpeeGoal = burpeeGoal;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	@Override
	public String toString() {
		return "User [user=" + user + ", userId=" + userId + ", userLoginId=" + userLoginId + ", userName=" + userName
				+ ", burpeeGoal=" + burpeeGoal + ", userImg=" + userImg + "]";
	}
	
	
	

}
