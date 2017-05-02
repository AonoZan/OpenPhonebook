
package com.webimenik.dao.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.webimenik.dto.User;
import com.webimenik.utils.ConnectionManager;
import com.webimenik.utils.PropertiesLoader;

/**
 *  @author AonoZan Dejan Petrovic 2016 ©
 */
public class ReadUser implements IReadableUser{
	Properties properties = PropertiesLoader.getInstance().getProperties();
	Connection connection = ConnectionManager.getInstance().getConnection();
	
	@Override
	public int userID(User user) throws SQLException {
		String sql = "SELECT * FROM "
				+ properties.getProperty("db_user_table_name")
				+ " WHERE name = ?"
				+ " AND password = ?;";
		int ID = 0;
		ResultSet rs = null;
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setString(1, user.getName());
			statement.setString(2, user.getPassword());
			
			rs = statement.executeQuery();
			
			if (rs.next()) {
				ID = rs.getInt("user_id");
			}
			
		}
		
		return ID;
	}

	@Override
	public User getUser(int userID) throws SQLException {
		String sql = "SELECT * FROM "
				+ properties.getProperty("db_user_table_name")
				+ " WHERE user_id = ?;";
		User user = null;
		ResultSet rs = null;
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setInt(1, userID);
			
			rs = statement.executeQuery();
			
			if (rs.next()) {
				user = new User(rs.getInt("user_id"),
						rs.getString("name"),
						rs.getString("password"));
			}
			
		}
		
		return user;
	}
}

