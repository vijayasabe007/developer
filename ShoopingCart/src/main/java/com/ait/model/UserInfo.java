package com.ait.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class UserInfo 
{
	@Id
	@GeneratedValue
	private int id;
	private String emailid;
	private long mobileno;
	private String username;
	private String password;
	@ManyToOne
	private Role role;
	
	
	public UserInfo() 
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public UserInfo(int id, String emailid, long mobileno, String username, String password, Role role) {
		super();
		this.id = id;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.username = username;
		this.password = password;
		this.role = role;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public long getMobileno() {
		return mobileno;
	}


	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", emailid=" + emailid + ", mobileno=" + mobileno + ", username=" + username
				+ ", password=" + password + ", role=" + role + "]";
	}
	
	
	
	
	
	
	
}
