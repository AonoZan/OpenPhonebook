
package com.webimenik.dao.contact;

import java.sql.SQLException;

import com.webimenik.dto.Contact;


/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public interface IWritableContact {
	public boolean addContact(Contact contact) throws SQLException;
}

