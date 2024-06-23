package com.tax.business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tax.sql_querys.SQLQueryies;
import com.tax.util.DatabaseConnection;

public class BusinessProcess {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public void createTable() {

		try {
			con = DatabaseConnection.getConnection();
			ps = con.prepareStatement(SQLQueryies.SQL_CREATE_TABLE);
			int executeUpdate = ps.executeUpdate();
			System.out.println("Table created successfully...." + executeUpdate);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.closeResurces(con, ps);
		}

	}

	public void insertIntoTable() {
		try {
			con = DatabaseConnection.getConnection();
			ps = con.prepareStatement(SQLQueryies.INSERT_INTO_TABLE);
			ps.setInt(1, 106);
			ps.setString(2, "Sanju Yadav");
			ps.setString(3, "Village Matehu Dist Ghazipur");
			int executeUpdate = ps.executeUpdate();
			System.out.println("Insert record into table successfully..." + executeUpdate);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.closeResurces(con, ps);
		}

	}

	public void updateIntoTable() {
		try {
			con = DatabaseConnection.getConnection();
			ps = con.prepareStatement(SQLQueryies.UPDATE_INTO_TABLE);

			ps.executeUpdate();
			System.out.println("Update record into table successfully...");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.closeResurces(con, ps);
		}

	}

	public void deleteFromTable() {
		try {
			con = DatabaseConnection.getConnection();
			ps = con.prepareStatement(SQLQueryies.DELETE_RECORD_TABLE);

			ps.executeUpdate();
			System.out.println("Delete record from table successfully...");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.closeResurces(con, ps);
		}

	}

	public void fetchDataFromTable() {
		try {
			con = DatabaseConnection.getConnection();
			ps = con.prepareStatement(SQLQueryies.FETCH_RECORD_FROM_TABLE);
			rs = ps.executeQuery();
			System.out.println("EmpId :     EmpName     :     EmpAddress");
			while (rs.next()) {
				int EmpId = rs.getInt(1);
				String EmpName = rs.getString(2);
				String EmpAddress = rs.getString(3);
				System.out.println(EmpId + "  :  " + EmpName + " :  " + EmpAddress);

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.closeResurces(con, ps, rs);
		}
	}

}
