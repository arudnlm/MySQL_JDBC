package com.tax.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBCProgram {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String SQL_TABLE_CREAT="create table EMP(empId int, EmpName varchar(30))";
		String URL="jdbc:mysql://localhost:3306/dharam_db";
		String USER="root";
		String PASSWORD="root";		
		
		
	
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 con = DriverManager.getConnection(URL, USER, PASSWORD);
				 stmt = con.createStatement();
				int executeUpdate = stmt.executeUpdate(SQL_TABLE_CREAT);
				System.out.println("Table create succfully:>>> "+executeUpdate);
			} catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
