package com.configuration;

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
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(CONNECTION_URL,USER,PASS);
			return con;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) 
	{
		Connection c=DBConnect.getMyConnection();
		if(c!=null)
		{
			System.out.println("Connection Successful");
		}
		else
		{
			System.out.println("Connection Failed");
		}
			
	}
}
