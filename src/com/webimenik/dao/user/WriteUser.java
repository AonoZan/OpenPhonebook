
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
public class WriteUser implements IWritableUser{
	Properties properties = PropertiesLoader.getInstance().getProperties();
	Connection connection = ConnectionManager.getInstance().getConnection();
	
	@Override
	public boolean addUser(User user) throws SQLException {
		String sql = "INSERT INTO "
				+ properties.getProperty("db_user_table_name")
				+ " (name, password) VALUES (?, ?);";
		
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			
			statement.setString(1, user.getName());
			statement.setString(2, user.getPassword());
			
			statement.executeUpdate();
			
			return true;
		}
	}
}

