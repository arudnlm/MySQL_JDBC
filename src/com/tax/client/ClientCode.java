package com.tax.client;

import java.util.Scanner;

import com.tax.business.BusinessProcess;

public class ClientCode {

	public static void main(String[] args) {
		BusinessProcess bpObj = new BusinessProcess();
		
		//bpObj.createTable();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to execute query in mySql database.....\n");
		System.out.println("Enter 1 to insert record in table: ");
		System.out.println("Enter 2 to update record in table: ");
		System.out.println("Enter 3 to delete record in table: ");
		System.out.println("Enter 4 to fetch record from table: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			bpObj.insertIntoTable();
			break;
		case 2:
			bpObj.updateIntoTable();
			break;
		case 3:
			bpObj.deleteFromTable();
			break;
		case 4:
			bpObj.fetchDataFromTable();
			break;
		default:
			System.out.println("Invalid number please put number between 1 to 4: ");
			break;
		}
		
		sc.close();
	}

}
