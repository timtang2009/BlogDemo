package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	
	private static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static String CONNECTION_STRING = 
			"jdbc:mysql://localhost:3306/diary?" + 
	        "user=root&password=timtang09&userUnicode=true&characterEncoding=utf-8";
	private static void testInsert(String sqlCommand) {
		try {
			Class.forName(DRIVER_NAME);
			Connection connection = DriverManager.getConnection(CONNECTION_STRING);
			
			Statement statement = connection.createStatement();
			int count = statement.executeUpdate(sqlCommand);
			System.out.println(count + "datas have been inserted!");
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		String insert = "INSERT INTO diary(title,content,authorname,time) VALUES('a diary', 'some words','noname', NOW())";
		testInsert(insert);
	}
}
