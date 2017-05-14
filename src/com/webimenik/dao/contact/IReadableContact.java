package com.webimenik.dao.contact;

import java.sql.SQLException;
import java.util.ArrayList;

import com.webimenik.dto.Contact;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public interface IReadableContact {
	public int contactID(Contact contact) throws SQLException;
	public Contact getContact(int contactID) throws SQLException;
	public ArrayList<Contact> getContacts(int userID) throws SQLException;
	public ArrayList<Contact> searchContacts(int userID, String term) throws SQLException;
}

