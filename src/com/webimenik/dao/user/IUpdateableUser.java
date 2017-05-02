
package com.webimenik.dao.user;

import java.sql.SQLException;

import com.webimenik.dto.User;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public interface IUpdateableUser {
	public boolean updateUser(User user) throws SQLException;
	public boolean deleteUser(User user) throws SQLException;
}

