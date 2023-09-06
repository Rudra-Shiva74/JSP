package com.tech.blog.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection conn;

	public static Connection createConnection() {
		String url = "jdbc:mysql://localhost:3306/techblog";
		String userString = "root";  
		String paString = "ShivaRudra@7488";
		try {
			if (conn == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, userString, paString);
				return conn;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
