package com.webimenik.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import com.webimenik.dto.Contact;

public interface ContactBO {

	public ArrayList<Contact> getAllContactsDao(String username) throws SQLException;

	public Contact getContactBo(int contactId) throws SQLException;

	public boolean addContactBo(Contact contact) throws SQLException;
	
	public boolean editContactBo(int contactId) throws SQLException;

	public boolean deleteContactBo(int contactId) throws SQLException;
	
}
