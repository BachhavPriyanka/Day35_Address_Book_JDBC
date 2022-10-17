package com.bl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Test {
	public static void main(String[] args) {
		Test objTest = new Test();
		objTest.create_data( "pri", "Bachhav", "AirForce_camp", "Nashik", "Maharashtra", "422207", "98474582");

	}
	public void create_data(String firstName, String lastName, String address,
			String cityName, String stateName, String zip, String phoneNumber) {
		
		AddressBook objAddressBook = new AddressBook();
		Connection connection = objAddressBook.get_connection();
		
		PreparedStatement pa = null;
		try {
			String query = "insert into contact(firstName, lastName, address,"
					+ " cityName, stateName, zip, phoneNumber) values (?, ?, ?, ?, ?, ?, ?)";
			pa = connection.prepareStatement(query);
			pa.setString(1, firstName);
			pa.setString(2, lastName);
			pa.setString(3, address);
			pa.setString(4, cityName);
			pa.setString(5, stateName);
			pa.setString(6, zip);
			pa.setString(7, phoneNumber);
			System.out.println(pa);
			pa.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
