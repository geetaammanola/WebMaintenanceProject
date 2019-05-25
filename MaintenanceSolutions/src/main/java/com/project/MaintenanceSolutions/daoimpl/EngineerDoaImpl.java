package com.project.MaintenanceSolutions.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.MaintenanceSolutions.dao.EngineerDao;
import com.project.MaintenanceSolutions.modal.Engineer;
import com.project.MaintenanceSolutions.util.DbUtil;

public class EngineerDoaImpl implements EngineerDao {
	private Connection conn;

	public EngineerDoaImpl() {
		conn = DbUtil.getConnection();
	}

	@Override
	public void addEngineers(Engineer engineers) {
		try {
			String query = "insert into engineer(engineerId,name,email,mobileNo,address) values (?,?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			preparedStatement.setInt(1, engineers.getEngineerId());
			preparedStatement.setString(2, engineers.getName());
			preparedStatement.setString(3, engineers.getEmail());
			preparedStatement.setInt(4, engineers.getMobileNo());
			preparedStatement.setString(5, engineers.getAddress());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEngineers(int engineerId) {
		try {
			String query = "delete from engineer where engineerId=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, engineerId);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateEngineers(Engineer engineer) {
		try {
			String query = "update engineer set Name=?, email=?, mobileNo=?,  address=? where engineerId=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			preparedStatement.setString(1, engineer.getName());
			preparedStatement.setString(2, engineer.getEmail());

			preparedStatement.setInt(3, engineer.getMobileNo());
			preparedStatement.setString(4, engineer.getAddress());

			preparedStatement.setInt(5, engineer.getEngineerId());

			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Engineer> getAllEngineers() {
		List<Engineer> engineers = new ArrayList<Engineer>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from engineer");
			while (resultSet.next()) {
				Engineer engineer = new Engineer();

				engineer.setEngineerId(resultSet.getInt("engineerId"));
				engineer.setName(resultSet.getString("name"));
				engineer.setEmail(resultSet.getString("email"));
				engineer.setMobileNo(resultSet.getInt("mobileNo"));
				engineer.setAddress(resultSet.getString("address"));

				engineers.add(engineer);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return engineers;
	}

	@Override
	public Engineer getEngineersById(int engineerId) {
		Engineer engineer = new Engineer();
		try {
			String query = "select * from engineer where engineerId=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, engineerId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				engineer.setEngineerId(resultSet.getInt("engineerId"));
				engineer.setName(resultSet.getString(" name "));
				engineer.setEmail(resultSet.getString(" email "));
				engineer.setMobileNo(resultSet.getInt(" mobileNo "));
				engineer.setAddress(resultSet.getString(" address "));

			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return engineer;
	}

}
