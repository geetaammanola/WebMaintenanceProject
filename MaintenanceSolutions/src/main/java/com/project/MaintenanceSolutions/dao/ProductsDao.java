package com.project.MaintenanceSolutions.dao;

import java.util.List;

import com.project.MaintenanceSolutions.modal.Products;



public interface ProductsDao {
	
	public void addProducts( Products products );
	public void deleteProducts( int productsId );
	public void updateProducts( Products products);
	public List<Products> getAllProducts();
	public Products getProductById(int productId);
	

}
