package com.bl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class Test {
	public static void main(String[] args) {
		Test objTest = new Test();
		// objTest.create_data( "pri", "Bachhav", "AirForce_camp", "Nashik",
		// "Maharashtra", "422207", "98474582");
		// objTest.read_data("pri");
		objTest.update_data("pri", "Airforce_camp", "Nsk", "MH", "8767", "88888888", "98474582");
	}

	public void read_data(String firstName) {

		AddressBook objAddressBook = new AddressBook();
		Connection connection = objAddressBook.get_connection();

		PreparedStatement pa = null;
		ResultSet rs = null;
		try {
			String query = "select * from contact where firstName = ?";
			pa = connection.prepareStatement(query);
			pa.setString(1, firstName);

			System.out.println(pa);
			rs = pa.executeQuery();

			while (rs.next()) {
				System.out.println("Name : " + rs.getString("firstName"));
				System.out.println("Last Name : " + rs.getString("lastName"));
				System.out.println("Contact : " + rs.getString("phoneNumber"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void create_data(String firstName, String lastName, String address, String cityName, String stateName,
			String zip, String phoneNumber) {

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

	public void update_data(String firstName, String address, String cityName, String stateName, String zip,
			String phoneNumber, String new_phoneNumber) {

		AddressBook objAddressBook = new AddressBook();
		Connection connection = objAddressBook.get_connection();

		PreparedStatement pa = null;

		try {
			String query = "update contact set firstName = ?, address = ?, cityName = ?, stateName = ?, phoneNumber = ? where phoneNumber = ?";
			pa = connection.prepareStatement(query);
			pa.setString(1, firstName);
			pa.setString(2, address);
			pa.setString(3, cityName);
			pa.setString(4, stateName);
			pa.setString(5, phoneNumber);
			pa.setString(6, new_phoneNumber);

			System.out.println(pa);
			pa.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
