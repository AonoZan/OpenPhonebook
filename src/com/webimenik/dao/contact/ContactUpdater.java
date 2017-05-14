
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
public class ContactUpdater implements IUpdateableContact {
	Properties properties = PropertiesLoader.getInstance().getProperties();
	Connection connection = ConnectionManager.getInstance().getConnection();

	@Override
	public boolean updateContact(Contact contact) throws SQLException {
		String sql = "UPDATE "
				+ properties.getProperty("db_contact_table_name")
				+ " SET user_id = ?"
				+ ", name = ?"
				+ ", phone = ?"
				+ ", dob = DATE(?)"
				+ ", email = ?"
				+ ", note = ?"
				+ " WHERE contact_id = ?;";
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setInt(1, contact.getUserID());
			statement.setString(2, contact.getName());
			statement.setString(3, contact.getPhone());
			statement.setString(4, contact.getDob());
			statement.setString(5, contact.getEmail());
			statement.setString(6, contact.getNote());
			
			statement.setInt(7, contact.getID());
			
			statement.executeUpdate();
			
			return true;
		}
	}

	@Override
	public boolean deleteContact(Contact contact) throws SQLException {
		String sql = "DELETE FROM "
				+ properties.getProperty("db_contact_table_name")
				+ " WHERE contact_id = ?;";
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setInt(1, contact.getID());
			
			statement.executeUpdate();
			
			return true;
		}
	}
	
}

