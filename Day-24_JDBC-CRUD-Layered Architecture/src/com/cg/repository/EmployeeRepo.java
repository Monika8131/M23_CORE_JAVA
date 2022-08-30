package com.cg.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cg.entities.Employee;

public interface EmployeeRepo 
{
	Statement createStatement();
	PreparedStatement createPrepareStatmenet(String query);
	public ResultSet RetreiveQuery(String query);//retrieve
	public int AddQuery(String query, Employee e);//Add
	public int updateQuery(String query, Employee e);//update
	public int DeleteQuery(String query);//delete
}
