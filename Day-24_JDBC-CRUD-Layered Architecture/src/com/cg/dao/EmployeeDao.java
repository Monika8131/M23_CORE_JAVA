package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Data access Object
public class EmployeeDao 
{
	//making a connection between java and MySql
	public Connection createConncetion()
	{
		String URL="jdbc:mysql://127.0.0.1:30306/TNS";
		String user="root";
		String password="open";
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Connection c;
		try
		{
			c=DriverManager.getConnection(URL,user, password);
		}
		catch(SQLException e)
		{
			c=null;
		}
		return c;
	}
}
