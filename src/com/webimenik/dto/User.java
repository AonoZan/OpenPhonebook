
package com.webimenik.dto;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public class User {
	private int ID = 0;
	public String _name;
	public String _password;
	
	
	public User(String name, String password) {
		this._name = name;
		this._password = password;
	}

	public User(int ID, String name, String password) {
		this(name, password);
		this.ID = ID;
	}
	
	public int getUserID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return _name;
	}

	public String getPassword() {
		return _password;
	}

	@Override
	public String toString() {
		return "User [userID=" + ID + ", name=" + _name + ", password=" + _password + "]";
	}
}
