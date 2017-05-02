
package com.webimenik.dao.user;

import java.sql.SQLException;

import com.webimenik.dto.User;


/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public interface IWritableUser {
	public boolean addUser(User user) throws SQLException;
}

