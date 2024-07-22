package com.thinkconstructive.user_service;

public class User {
	private String userId;
	private String userName;
	private String userPhoneNumer;
	private Posts posts;
	private Notifications notifications;

	public Posts getPosts() {
		return posts;
	}

	public void setPosts(Posts posts) {
		this.posts = posts;
	}

	public Notifications getNotifications() {
		return notifications;
	}

	public void setNotifications(Notifications notifications) {
		this.notifications = notifications;
	}

	public User(String userId, String userName, String userPhoneNumer) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNumer = userPhoneNumer;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumer() {
		return userPhoneNumer;
	}

	public void setUserPhoneNumer(String userPhoneNumer) {
		this.userPhoneNumer = userPhoneNumer;
	}

}
