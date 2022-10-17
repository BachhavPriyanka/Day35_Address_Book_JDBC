package com.bl.jdbc;

import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class AddressBook {
//	static String insertQuery = "insert into contact(firstName, lastName, address,"
//			+ " cityName, stateName, zip, phoneNumber) values('Niti', 'Singh', 'ganesh nagar','amritsar','Punjab','422204','973447479')";
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
//		System.out.println("Welcome to Address Book of MySQL");
//		Scanner sc = new Scanner(System.in);
//		int input = 0;
//		try {
//			// load driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver loaded...");
//
//			// make connection
//			String DBName = "Addressbook";
//			String URL = "jdbc:mysql://localhost:3306/" + DBName;
//			String dbUserName = "root";
//			String dbPass = "Root";
//			Connection con = DriverManager.getConnection(URL, dbUserName, dbPass);
//			System.out.println("Connected with " + dbUserName);
//
//			// create statement
//			Statement stat = con.createStatement();
//			System.out.println("Statement Obj Created...");
//			do {
//				System.out.println("1. Insert Query");
//				System.out.println("2. Select Query");
//				System.out.println("0. Exit");
//				System.out.println("Enter Operation You Wanna Perform : ");
//				input = sc.nextInt();
//
//				switch (input) {
//				case 1:
//
//					// execute query
//					int noOFRowsAffected = stat.executeUpdate(insertQuery);
//					if (noOFRowsAffected > 0)
//						System.out.println("Record Inserted!");
//					break;
//
//				case 2:
//					String selectQuery = "select * from priyanka";
//					ResultSet rs = stat.executeQuery(selectQuery);
//					System.out.println(rs);
//					System.out.println("Id | Name | Password");
//					while (rs.next()) {
//						System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
//					}
//					break;
//
//				case 0:
//					System.out.println("Exited");
//					break;
//
//				default:
//					System.out.println("Invalid Input");
//					break;
//				}
//
//			} while (input != 0);
//		} catch (ClassNotFoundException e) {
//			System.out.println(e);
//		} catch (SQLException e) {
//			System.out.println(e);
//		}
//	}
	public static void main(String[] args) {
		AddressBook objAddressBook = new AddressBook();
		System.out.println(objAddressBook);
		
	}
		public Connection get_connection() {
			Connection connection = null;  //created connection class which is null
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded...");
				
				String DBName = "Addressbook";
				String URL = "jdbc:mysql://localhost:3306/" + DBName;
				String dbUserName = "root";
				String dbPass = "Root";
				connection = DriverManager.getConnection(URL, dbUserName, dbPass);
			}catch (Exception e) {
				System.out.println(e);
			}
			return connection;
			
			
		}
	
}
