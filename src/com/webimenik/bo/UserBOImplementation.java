
package com.webimenik.bo;

import com.webimenik.dao.user.IReadableUser;
import com.webimenik.dao.user.IUpdateableUser;
import com.webimenik.dao.user.IWritableUser;
import com.webimenik.dto.User;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public class UserBOImplementation {
	IReadableUser userReader;
	IWritableUser userWriter;
	IUpdateableUser userUpdater;
	
	public int userID(User user) {
		int userID = 0;
		try {
			userID = userReader.userID(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return userID;
	}
	
	public User getUser(int userID) {
		User user = null;
		try {
			user = userReader.getUser(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return user;
	}
	
	public boolean updateUser(User user) {
		boolean result = false;
		try {
			result = userUpdater.updateUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	public boolean deleteUser(User user) {
		boolean result = false;
		try {
			result = userUpdater.deleteUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	public boolean addUser(User user) {
		boolean result = false;
		try {
			result = userWriter.addUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	public void setUserReader(IReadableUser userReader) {
		this.userReader = userReader;
	}
	public void setUserWriter(IWritableUser userWriter) {
		this.userWriter = userWriter;
	}
	public void setUserUpdater(IUpdateableUser userUpdater) {
		this.userUpdater = userUpdater;
	}
	
}

