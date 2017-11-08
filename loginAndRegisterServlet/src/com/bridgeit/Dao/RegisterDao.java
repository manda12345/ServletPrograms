package com.bridgeit.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bridgeit.Model.RegisterBean;
public class RegisterDao {
	public int register(RegisterBean registerBean) {
		int count = 0;
		Connection connection = null;
		try {
			connection = ConnectionClass.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into Register values(?,?,?,?,?)");
			preparedStatement.setString(1, registerBean.getUserName());
			preparedStatement.setString(2, registerBean.getEmailId());
			preparedStatement.setString(3, registerBean.getPassword());
			preparedStatement.setString(4, registerBean.getConfirmPassword());
			preparedStatement.setString(5, registerBean.getMobileNumber());
			System.out.println("before execute update");
			count = preparedStatement.executeUpdate();
			System.out.println("sucess");
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
