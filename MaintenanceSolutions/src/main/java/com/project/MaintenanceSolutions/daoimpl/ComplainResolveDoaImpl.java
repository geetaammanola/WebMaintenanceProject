package com.project.MaintenanceSolutions.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.MaintenanceSolutions.dao.ComplainResolveDao;
import com.project.MaintenanceSolutions.modal.ComplainResolve;
import com.project.MaintenanceSolutions.util.DbUtil;

public class ComplainResolveDoaImpl implements ComplainResolveDao {

	private Connection conn;

	public ComplainResolveDoaImpl() {
		conn = DbUtil.getConnection();
	}

	@Override
	public void addsolvedComplain(ComplainResolve ComplainResolve) {

		try {
			String query = "insert into resolve(resolveid,date,engineerName,cmobileNo,solDes,part,charges) values (?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			preparedStatement.setInt(1, ComplainResolve.getResolveid());
			preparedStatement.setDate(2, new java.sql.Date(ComplainResolve.getDate().getTime()));

			preparedStatement.setString(3, ComplainResolve.getEngineerName());
			preparedStatement.setInt(4, ComplainResolve.getClientMobileNo());
			preparedStatement.setString(5, ComplainResolve.getSolution());
			preparedStatement.setString(6, ComplainResolve.getPart());
			preparedStatement.setInt(7, ComplainResolve.getCharges());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deletesolvedComplains(int resolveid) {
		try {
			String query = "delete from resolve where resolveid=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, resolveid);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updatesolvedComplains(ComplainResolve ComplainResolve) {
		try {
			String query = "update resolve set date=? , engineerName=?, cmobileNo=?, solDes=?,  part=?, charges=? where resolveid=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			
			

			
			preparedStatement.setDate(1, new java.sql.Date(ComplainResolve.getDate().getTime()));

			preparedStatement.setString(2, ComplainResolve.getEngineerName());
			preparedStatement.setInt(3, ComplainResolve.getClientMobileNo());
			preparedStatement.setString(4, ComplainResolve.getSolution());
			preparedStatement.setString(5, ComplainResolve.getPart());
			preparedStatement.setInt(6, ComplainResolve.getCharges());
			
			
			
			preparedStatement.setInt(7, ComplainResolve.getResolveid());
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

	@Override
	public List<ComplainResolve> getAllsolvedComplains() {
		List<ComplainResolve> resolves = new ArrayList<ComplainResolve>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery( "select * from resolve" );
			while( resultSet.next() ) {
				ComplainResolve resolve = new ComplainResolve();
				
				resolve.setResolveid(resultSet.getInt( "resolveid" ));
				resolve.setDate(resultSet.getDate( "date" ));
				resolve.setEngineerName(resultSet.getString( "engineerName" ));
				resolve.setClientMobileNo(resultSet.getInt( "cmobileNo" ));
				resolve.setSolution(resultSet.getString( "solDes" ));
				resolve.setPart(resultSet.getString("part"));
				resolve.setCharges(resultSet.getInt( "charges" ));
				
				resolves.add(resolve);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resolves;
	}

	@Override
	public ComplainResolve getResolveById(int resolveid) {
		ComplainResolve resolve = new ComplainResolve();
		try {
			String query = "select * from resolve where resolveid=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setInt(1, resolveid);
			ResultSet resultSet = preparedStatement.executeQuery();
			while( resultSet.next() ) {
				
				
				resolve.setResolveid(resultSet.getInt( "resolveid" ));
				resolve.setDate(resultSet.getDate( "date" ));
				resolve.setEngineerName(resultSet.getString( "engineerName" ));
				resolve.setClientMobileNo(resultSet.getInt( "cmobileNo" ));
				resolve.setSolution(resultSet.getString( "solution" ));
				resolve.setPart(resultSet.getString("part"));
				resolve.setCharges(resultSet.getInt( "charges" ));
				
	
				
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resolve;
	}

}
