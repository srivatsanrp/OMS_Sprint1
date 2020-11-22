package com.cg.oms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserLogin")
public class LoginEntity {

	@Id
	@Column(name = "user_Id",length=5)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	@Column(name = "user_Name",length=10)
	private String userName;

	@Column(name = "user_Pwd",length=10)
	private String userPwd;

	@Column(name = "user_Role",length=10)
	private String userRole;

	public LoginEntity() {
		super();
	}

	public LoginEntity( String userName, String userPwd, String userRole) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.userRole = userRole;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getuserPwd() {
		return userPwd;
	}

	public void setuserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getuserRole() {
		return userRole;
	}

	public void setuserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "loginentity [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userRole=" + userRole
				+ "]";
	}
}
