
package com.webimenik.dao.user;

import java.sql.SQLException;

import com.webimenik.dto.User;


/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public interface IReadableUser {
	public int userID(User user) throws SQLException;
	public User getUser(int userID) throws SQLException;
}

