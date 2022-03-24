package com.sapient.aem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import com.sapient.aem.model.Role;
import com.sapient.aem.model.User;

public class UserDaoImpl implements UserDAO{

	private static UserValidationDAO userValidationDAO = new UserValidationDaoImpl();
	private static User user = new User();
	@Override
	public Boolean isValidUser(String userName, String password, Role role) throws Exception{
		String sql="select * from registered_users where user_name=? and password=? and role=?";
		Connection connection=null;
		try {
			Context envContext = (Context) new InitialContext().lookup("java:comp/env");		
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/fmsDB");
			connection= dataSource.getConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			//if(userValidationDAO.isAuthorizeUser(user)) {
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, role.toString());
			//}
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			throw new Exception(e.getMessage(),e);
		}finally {
			connection.close();
		}

	}

	@Override
	public Integer addUser(User user) throws Exception{
		String sql="insert into user(user_name,password,role) values(?,?,?)";
		Connection connection=null;
		try {
			Context envContext = (Context) new InitialContext().lookup("java:comp/env");		
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/emsDB");
			connection= dataSource.getConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getRole().toString());
			int n= preparedStatement.executeUpdate();
			if(n>0) {
				return this.getUserId(user);
			}else {
				return null;
			}
		}catch(Exception e) {
			throw new Exception(e.getMessage(),e);
		}finally {
			connection.close();
		}

	}

	@Override
	public Integer getUserId(User user) throws Exception {
		String sql="select user_id from user where user_name=? and password=? and role=?";
		Connection connection=null;
		try {
			Context envContext = (Context) new InitialContext().lookup("java:comp/env");		
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/emsDB");
			connection= dataSource.getConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getRole().toString());
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {				
				return resultSet.getInt("user_id");
			}else {
				return null;
			}
		}catch(Exception e) {
			throw new Exception(e.getMessage(),e);
		}finally {
			connection.close();
		}

	}

}
