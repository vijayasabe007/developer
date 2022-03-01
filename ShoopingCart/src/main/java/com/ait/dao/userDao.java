package com.ait.dao;

import java.util.List;


import com.ait.model.UserInfo;

public interface userDao 
{
	
	boolean insertUser(UserInfo u);

	boolean deleteUserById(int uid);

	boolean updateUser(UserInfo u);

	List<UserInfo> getAllUsers();

	UserInfo getUserById(int id);
	
	UserInfo getUserByNameAndPassword(String name,String password);
}
