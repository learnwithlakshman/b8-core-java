package com.careerit.cj.collection.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

		public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
			
				Properties properties = new Properties();
				properties.load(new FileInputStream("application.properties"));
				
				Connection con = DriverManager.getConnection(properties.getProperty("url"),
															 properties.getProperty("db.username"),properties.getProperty("db.password"));
				System.out.println(con);
				
				
		}
}
