
package com.webimenik.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public class ConnectionManager {
	
	private static ConnectionManager instance;
	
	private Connection connection;
	
	private Properties properties = PropertiesLoader.getInstance().getProperties();
	
	private ConnectionManager(){
	}
	
	public static ConnectionManager getInstance() {
		if(instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}
	
	public boolean openConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					properties.getProperty("db_conn_string"),
					properties.getProperty("db_user_name"),
					properties.getProperty("db_user_pass")
					);
			return true;
		} catch (SQLException e) {
			System.out.println("Error  " + e.getMessage());
			return true;
		} catch (Exception e) {
			System.out.println("Error  " + e.getMessage());
			return false;
		}
	}
	
	public Connection getConnection() {
		if(connection == null) {
			if (openConnection()) {
				return connection;
			} else {
				System.out.println("Konekcija nije otvorena.");
				return null;
			}
		}
		return connection;
	}
	
	public String getProperty(String property) {
		return this.properties.getProperty(property);
	}
}

