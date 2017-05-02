
package com.webimenik.dao.contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.webimenik.dto.Contact;
import com.webimenik.utils.ConnectionManager;
import com.webimenik.utils.PropertiesLoader;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public class ContactReader implements IReadableContact {
	Properties properties = PropertiesLoader.getInstance().getProperties();
	Connection connection = ConnectionManager.getInstance().getConnection();

	@Override
	public int contactID(Contact contact) throws SQLException {
		String sql = "SELECT * FROM "
				+ properties.getProperty("db_contact_table_name")
				+ " WHERE name = ?"
				+ " AND user_id = ?;";
		int ID = 0;
		ResultSet rs = null;
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setString(1, contact.getName());
			statement.setInt(2, contact.getID());
			
			rs = statement.executeQuery();
			
			if (rs.next()) {
				ID = rs.getInt("contact_id");
			}
		}
		
		return ID;
	}

	@Override
	public Contact getContact(int contactID) throws SQLException {
		String sql = "SELECT * FROM "
				+ properties.getProperty("db_contact_table_name")
				+ " WHERE contact_id = ?;";
		Contact contact = null;
		ResultSet rs = null;
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setInt(1, contactID);
			
			rs = statement.executeQuery();
			
			if (rs.next()) {
				contact = new Contact(contactID, rs.getString("name"));
//				contact.setID(rs.getInt("contact_id"));
				contact.setPhone(rs.getString("phone"));
				contact.setDob(rs.getString("dob"));
				contact.setEmail(rs.getString("email"));
				contact.setNote(rs.getString("note"));
			}
		}
		
		return contact;
	}

	@Override
	public ArrayList<Contact> getContacts(int userID) throws SQLException {
		String sql = "SELECT * FROM "
				+ properties.getProperty("db_contact_table_name")
				+ " WHERE user_id = ?;";
		Contact contact = null;
		ResultSet rs = null;
		ArrayList<Contact> contactList = new ArrayList<>();
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setInt(1, userID);
			
			rs = statement.executeQuery();
			
			while (rs.next()) {
				contact = new Contact(userID, rs.getString("name"));
//				contact.setID(rs.getInt("contact_id"));
				contact.setPhone(rs.getString("phone"));
				contact.setDob(rs.getString("dob"));
				contact.setEmail(rs.getString("email"));
				contact.setNote(rs.getString("note"));
				
				contactList.add(contact);
			}
		}
		
		return contactList;
	}

	/* (non-Javadoc)
	 * @see com.webimenik.dao.contact.IReadableContact#searchContacts(int, java.lang.String)
	 */
	@Override
	public ArrayList<Contact> searchContacts(int userID, String term) throws SQLException {
		String sql = "SELECT * FROM "
				+ properties.getProperty("db_contact_table_name")
				+ " WHERE user_id = ?"
				+ " AND name LIKE ?;";
		Contact contact = null;
		ResultSet rs = null;
		ArrayList<Contact> contactList = new ArrayList<>();
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setInt(1, userID);
			statement.setString(2, "%" + term + "%");
			
			rs = statement.executeQuery();
			
			while (rs.next()) {
				contact = new Contact(userID, rs.getString("name"));
//				contact.setID(rs.getInt("contact_id"));
				contact.setPhone(rs.getString("phone"));
				contact.setDob(rs.getString("dob"));
				contact.setEmail(rs.getString("email"));
				contact.setNote(rs.getString("note"));
				
				contactList.add(contact);
			}
		}
		
		return contactList;
	}
	
}

