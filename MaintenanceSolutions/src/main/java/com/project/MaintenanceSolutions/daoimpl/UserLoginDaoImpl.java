package com.project.MaintenanceSolutions.daoimpl;

import java.sql.*;

import com.project.MaintenanceSolutions.dao.userLoginDao;
import com.project.MaintenanceSolutions.modal.userLogin;
import com.project.MaintenanceSolutions.util.DbUtil;

public class UserLoginDaoImpl implements userLoginDao {
	private Connection conn;

	public UserLoginDaoImpl() {
		conn = DbUtil.getConnection();
	}

	public boolean checkUser(String uname, String pass) {
		try {
			String query = "select * from login where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public void addUserLogin(userLogin user) {
		try {
			String query = "insert into login values(fname, lname, email, password) values (?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, user.getFname());
			preparedStatement.setString(2, user.getLname());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
