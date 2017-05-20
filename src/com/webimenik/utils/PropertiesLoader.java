
package com.webimenik.utils;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public class PropertiesLoader {
	private static PropertiesLoader propHandler;
	private static Properties properties;
	
	private PropertiesLoader() {
		readProperties();
	}
	public static PropertiesLoader getInstance() {
		if (propHandler == null) {
			propHandler = new PropertiesLoader();
		}
		return propHandler;
	}
	public Properties getProperties() {
		return properties;
	}
	
	private void readProperties() {
		properties = new Properties(getDefaultProperties());
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		try (Reader reader = Files.newBufferedReader(
				Paths.get(
						System.getProperty("user.dir") + 
						"/db_setup.properties"))){
			properties.load(reader);
		} catch (IOException e) {
			System.out.println
					( "Can't load properties from file."
					+ "\nDefaults properties used instead.");
		}
	}
	
	private static Properties getDefaultProperties() {
		Properties defaults = new Properties();
		
		defaults.setProperty("db_user_name", "root");
		defaults.setProperty("db_user_pass", "pass1919");
		defaults.setProperty("db_conn_string", "jdbc:mysql://localhost/phonebook?serverTimezone=UTC");
		defaults.setProperty("db_name", "phonebook");
		defaults.setProperty("db_user_table_name", "user");
		defaults.setProperty("db_contact_table_name", "contact");
		
		return defaults;
	}
}
