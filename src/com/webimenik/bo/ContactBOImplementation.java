
package com.webimenik.bo;

import java.util.ArrayList;

import com.webimenik.dao.contact.IReadableContact;
import com.webimenik.dao.contact.IUpdateableContact;
import com.webimenik.dao.contact.IWritableContact;
import com.webimenik.dto.Contact;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public class ContactBOImplementation {
	IReadableContact contactReader;
	IWritableContact contactWriter;
	IUpdateableContact contactUpdater;
	
	public int contactID(Contact contact) {
		int contactID = 0;
		try {
			contactID = contactReader.contactID(contact);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contactID;
	}
	
	public Contact getContact(int contactID) {
		Contact contact = null;
		if (contactID < 1) return null;
		try {
			contact = contactReader.getContact(contactID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contact;
	}
	
	public ArrayList<Contact> getContacts(int userID) {
		ArrayList<Contact> contactList = new ArrayList<>();
		if (userID < 1) return null;
		try {
			contactList = contactReader.getContacts(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contactList;
	}
	public ArrayList<Contact> searchContacts(int userID, String term) {
		ArrayList<Contact> contactList = new ArrayList<>();
		if (userID < 1) return null;
		try {
			contactList = contactReader.searchContacts(userID, term);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contactList;
	}
	
	public boolean updateContact(Contact contact) {
		boolean result = false;
		try {
			result = contactUpdater.updateContact(contact);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	public boolean deleteContact(Contact contact) {
		boolean result = false;
		try {
			result = contactUpdater.deleteContact(contact);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	public boolean addContact(Contact contact) {
		boolean result = false;
		try {
			result = contactWriter.addContact(contact);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	public void setContactReader(IReadableContact contactReader) {
		this.contactReader = contactReader;
	}
	public void setContactWriter(IWritableContact contactWriter) {
		this.contactWriter = contactWriter;
	}
	public void setContactUpdater(IUpdateableContact contactUpdater) {
		this.contactUpdater = contactUpdater;
	}
	
}

