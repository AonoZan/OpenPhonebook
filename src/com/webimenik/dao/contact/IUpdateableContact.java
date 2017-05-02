
package com.webimenik.dao.contact;

import java.sql.SQLException;

import com.webimenik.dto.Contact;


/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public interface IUpdateableContact {
	public boolean updateContact(Contact contact) throws SQLException;
	public boolean deleteContact(Contact contact) throws SQLException;
}

