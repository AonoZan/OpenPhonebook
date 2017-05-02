
package com.webimenik.dao.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.webimenik.dto.User;
import com.webimenik.utils.ConnectionManager;
import com.webimenik.utils.PropertiesLoader;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public class UpdateUser implements IUpdateableUser{
	Properties properties = PropertiesLoader.getInstance().getProperties();
	Connection connection = ConnectionManager.getInstance().getConnection();

	@Override
	public boolean updateUser(User user) throws SQLException {//int userID, String argument, String value) throws SQLException {
		String sql = "UPDATE "
				+ properties.getProperty("db_user_table_name")
				+ " SET name = ?"
				+ ", password = ?"
				+ " WHERE user_id = ?;";
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setString(1, user.getName());
			statement.setString(2, user.getPassword());
			statement.setInt(3, user.getUserID());
			
			statement.executeUpdate();
			
			return true;
		}
	}

	@Override
	public boolean deleteUser(User user) throws SQLException {
		String sql = "DELETE FROM "
				+ properties.getProperty("db_user_table_name")
				+ " WHERE user_id = ?;";
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setInt(1, user.getUserID());
			
			statement.executeUpdate();
			
			return true;
		}
	}
}

