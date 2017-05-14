package com.webimenik.bo;

import java.sql.SQLException;

import com.webimenik.dto.User;

public interface UserBO {

	public boolean registerUserBo(User user) throws SQLException;
	
	public boolean userLoginBo(String username, String password) throws SQLException;

}