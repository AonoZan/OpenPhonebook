
package com.webimenik.dao.contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.webimenik.dto.Contact;
import com.webimenik.utils.ConnectionManager;
import com.webimenik.utils.PropertiesLoader;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public class ContactWriter implements IWritableContact {
	Properties properties = PropertiesLoader.getInstance().getProperties();
	Connection connection = ConnectionManager.getInstance().getConnection();

	@Override
	public boolean addContact(Contact contact) throws SQLException {
		String sql = "INSERT INTO "
				+ properties.getProperty("db_contact_table_name")
				+ " (user_id, name, phone, dob, email, note)"
				+ " VALUES (?, ?, ?, ?, ?, ?);";
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setInt(1, contact.getUserID());
			statement.setString(2, contact.getName());
			statement.setString(3, contact.getPhone());
			statement.setString(4, contact.getDob());
			statement.setString(5, contact.getEmail());
			statement.setString(6, contact.getNote());
			
			statement.executeUpdate();
			
			return true;
		}
	}

}

