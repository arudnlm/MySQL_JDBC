package com.tax.sql_querys;

public class SQLQueryies {
	public static String SQL_CREATE_TABLE="create table EMPLOYEE(EmpId int, EmpName varchar(25), EmpAddress varchar(35))";
	public static String INSERT_INTO_TABLE="insert into EMPLOYEE(EmpId, EmpName, EmpAddress) values(?,?,?)";
	public static String UPDATE_INTO_TABLE="update employee set EmpName ='Suman' where EmpId=101 ";
	public static String DELETE_RECORD_TABLE="delete from employee where EmpId=101";
	public static String FETCH_RECORD_FROM_TABLE="select * from employee";

}
