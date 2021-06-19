package com.careerit.cj.collection.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Manager {

		public static void main(String[] args) {
			
				Properties properties = new Properties();
				try {
					properties.load(new FileInputStream("application.properties"));
					String username = properties.getProperty("app.username");
					System.out.println(username);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		}
}
