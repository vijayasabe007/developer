package com.ait.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role
{
	@Id
	@GeneratedValue
	private Integer roleId;
	private String roleType;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Integer roleId, String roleType) {
		super();
		this.roleId = roleId;
		this.roleType = roleType;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	
}
