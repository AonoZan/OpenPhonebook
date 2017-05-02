
package com.webimenik.dto;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public class Contact {
	public int ID;
	public int userID;
	public String _name;
	public String _phone;
	public String _dob;
	public String _email;
	public String _note;
	
	public Contact(int userID, String name) {
		this.userID = userID;
		this._name = name;
	}
	
	public int getID() {
		return ID;
	}
	public int getUserID() {
		return userID;
	}
	public String getName() {
		return _name;
	}
	public String getPhone() {
		return _phone;
	}
	public String getDob() {
		return _dob;
	}
	public String getEmail() {
		return _email;
	}
	public String getNote() {
		return _note;
	}

	
	public void setID(int ID) {
		this.ID = ID;
	}
	public void setPhone(String phone) {
		this._phone = phone;
	}
	public void setDob(String dob) {
		this._dob = dob;
	}
	public void setEmail(String email) {
		this._email = email;
	}
	public void setNote(String note) {
		this._note = note;
	}

	@Override
	public String toString() {
		return "....................."
			+ "\nName: " + _name
			+ "\nPhone: " + _phone
			+ (_dob != null ? "\nBirth date: " + _dob : "")
			+ (_email != null ? "\nEmail: " + _email : "")
			+ (_note != null ? "\nInfo: " + _note : "")
			+ "\n";
	}
}

