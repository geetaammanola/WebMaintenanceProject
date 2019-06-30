package com.project.MaintenanceSolutions.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.MaintenanceSolutions.dao.NewComplainDao;
import com.project.MaintenanceSolutions.modal.NewComplain;
import com.project.MaintenanceSolutions.util.DbUtil;

public class NewComplainDaoImpl implements NewComplainDao {
	private Connection conn;

	public NewComplainDaoImpl() {
		conn = DbUtil.getConnection();
	}

	@Override
	public void addNewComplains(NewComplain NewComplain) {

		try {
			String query = "insert into complain(complainer,fridgeType,issue, email, mobileNo, address,appDate,appSlot) values (?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			preparedStatement.setString(1, NewComplain.getComplainer());
			preparedStatement.setString(2, NewComplain.getFridgeType());
			preparedStatement.setString(3, NewComplain.getIssue());
			preparedStatement.setString(4, NewComplain.getEmail());
			preparedStatement.setInt(5, NewComplain.getMobileNo());
			preparedStatement.setString(6, NewComplain.getAddress());

			preparedStatement.setDate(7, new java.sql.Date(NewComplain.getAppDate().getTime()));
			preparedStatement.setString(8, NewComplain.getAppSlot());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteNewComplains(int ComplainId) {
		try {
			String query = "delete from complain where complainid=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, ComplainId);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateNewComplains(NewComplain NewComplain) {
		try {
			String query = "update complain set complainer=?,fridgeType=?,issue=?, email=?, mobileNo=?, address=?,appDate=?,appSlot=? where coplainid=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			preparedStatement.setString(1, NewComplain.getComplainer());
			preparedStatement.setString(2, NewComplain.getFridgeType());
			preparedStatement.setString(3, NewComplain.getIssue());
			preparedStatement.setString(4, NewComplain.getEmail());
			preparedStatement.setInt(5, NewComplain.getMobileNo());
			preparedStatement.setString(6, NewComplain.getAddress());
			preparedStatement.setDate(7, new java.sql.Date(NewComplain.getAppDate().getTime()));
			preparedStatement.setString(8, NewComplain.getAppSlot());
			//preparedStatement.setInt(9, NewComplain.getComplainId());

			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<NewComplain> getAllNewComplains() {
		List<NewComplain> complains = new ArrayList<NewComplain>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from complain");
			while (resultSet.next()) {
				NewComplain complain = new NewComplain();

				complain.setComplainId(resultSet.getInt("complainid"));
				complain.setComplainer(resultSet.getString("complainer"));
				complain.setFridgeType(resultSet.getString("fridgeType"));
				complain.setIssue(resultSet.getString("issue"));
				complain.setEmail(resultSet.getString("email"));
				complain.setMobileNo(resultSet.getInt("mobileNo"));
				complain.setAddress(resultSet.getString("address"));
				complain.setAppDate(resultSet.getDate("AppDate"));
				complain.setAppSlot(resultSet.getString("AppSlot"));

				complains.add(complain);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return complains;
	}

	@Override
	public NewComplain getNewComplainById(int ComplainId) {
		NewComplain complain = new NewComplain();
		try {
			String query = "select * from complain where complainid=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, ComplainId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				complain.setComplainId(resultSet.getInt("complainid"));
				complain.setComplainer(resultSet.getString("complainer"));
				complain.setFridgeType(resultSet.getString("fridgeType"));
				complain.setIssue(resultSet.getString("issue"));
				complain.setEmail(resultSet.getString("email"));
				complain.setMobileNo(resultSet.getInt("mobileNo"));
				complain.setAddress(resultSet.getString("address"));
				complain.setAppDate(resultSet.getDate("AppDate"));
				complain.setAppSlot(resultSet.getString("AppSlot"));

			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return complain;
	}

}
