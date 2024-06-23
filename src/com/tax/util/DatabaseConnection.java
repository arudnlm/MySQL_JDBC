package com.tax.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static String URL="jdbc:mysql://localhost:3306/dharam_db";
	private static String USER="root";
	private static String PASSWORD="root";
	

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		return con;
	}
	
	public static void closeResurces(Connection con, PreparedStatement ps) {
		if(con !=null || ps !=null) {
			try {
				ps.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void closeResurces(Connection con, PreparedStatement ps, ResultSet rs) {
		if(rs !=null) {
			
			try {
				rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			
		}
		
		if(con !=null || ps !=null) {
			try {
				ps.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
