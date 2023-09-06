package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConector {
	private static Connection conn;

	public DBConector(Connection conn) {
		this.conn = conn;
	}

	public static Connection createConnection() {
		String url = "jdbc:mysql://localhost:3306/techblog";
		String user = "root";
		String pass = "ShivaRudra@7488";
		try {
			if (conn == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, pass);
				System.out.println("Connected");
				return conn;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
