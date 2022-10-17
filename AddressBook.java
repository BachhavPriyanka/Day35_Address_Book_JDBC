package com.bl.jdbc;

import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class AddressBook {

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
