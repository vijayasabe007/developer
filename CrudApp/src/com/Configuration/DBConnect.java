package com.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect
{
	public static final String CONNECTION_URL="jdbc:mysql://localhost:3306/tqdp";
	public static final String USER="root";
	public static  final String PASS="root";
	
	public static Connection getMyConnection()
	{
		Connection con=null;

		try
		{
			con=DriverManager.getConnection(CONNECTION_URL,USER,PASS);
			return con;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return con;
	}
}
