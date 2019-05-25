package com.project.MaintenanceSolutions.daoimpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.project.MaintenanceSolutions.dao.ProductsDao;
import com.project.MaintenanceSolutions.modal.Products;
import com.project.MaintenanceSolutions.util.DbUtil;

public class ProductsDaoImpl implements ProductsDao {

	private Connection conn;

	public ProductsDaoImpl() {
		conn = DbUtil.getConnection();
	}

	@Override
	public void addProducts(Products products) {

		try {
			String query = "insert into product (productName, price, unit, date) values (?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			preparedStatement.setString(1, products.getProductName());
			preparedStatement.setInt(2, products.getPrice());
			preparedStatement.setInt(3, products.getUnit());
			preparedStatement.setDate(4, new java.sql.Date(products.getDate().getTime()));	
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProducts(int productsId) {
		try {
			String query = "delete from product where productId=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, productsId);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateProducts(Products products) {
		try {
			String query = "update product set productName=?, price=?, unit=?,  date=? where productId=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			
			preparedStatement.setString(1, products.getProductName());
			preparedStatement.setInt(2, products.getPrice());
			preparedStatement.setInt(3, products.getUnit());
			preparedStatement.setDate(4, new java.sql.Date(products.getDate().getTime()));
			preparedStatement.setInt(6, products.getProductId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Products> getAllProducts() {
		List<Products> products = new ArrayList<Products>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery( "select * from product" );
			while( resultSet.next() ) {
				Products product = new Products();
				
				product.setProductId( resultSet.getInt( "productId" ) );
				product.setProductName( resultSet.getString( "productName" ) );
				product.setPrice( resultSet.getInt( "price" ) );
				product.setUnit( resultSet.getInt( "unit" ) );
				product.setDate( resultSet.getDate( "date" ) );
			
			
				products.add(product);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
	
	
	@Override
	public Products getProductById(int productId) {
		Products product = new Products();
		try {
			String query = "select * from product where productId=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setInt(1, productId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while( resultSet.next() ) {
				
				product.setProductId( resultSet.getInt( "productId" ) );
				product.setProductName( resultSet.getString( "productName" ) );
				product.setPrice( resultSet.getInt( "price" ) );
				product.setUnit( resultSet.getInt( "unit" ) );
				product.setDate( resultSet.getDate( "date" ) );
				
				
				
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}


}
