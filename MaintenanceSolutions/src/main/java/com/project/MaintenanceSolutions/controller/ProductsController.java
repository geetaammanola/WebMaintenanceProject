package com.project.MaintenanceSolutions.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.MaintenanceSolutions.daoimpl.ProductsDaoImpl;
import com.project.MaintenanceSolutions.modal.Products;

@WebServlet("/ProductsController")
public class ProductsController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public static final String AllProduct = "/productList.jsp";
	public static final String INSERT_OR_EDIT = "/addNewProduct.jsp";
	private ProductsDaoImpl dao;

	public ProductsController() {
		super();
		dao = new ProductsDaoImpl();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("delete")) {
			int productId = Integer.parseInt(request.getParameter("productId"));
			dao.deleteProducts(productId);
			forward = AllProduct;
			request.setAttribute("products", dao.getAllProducts());
		} else if (action.equalsIgnoreCase("edit")) {
			forward = INSERT_OR_EDIT;
			int productId = Integer.parseInt(request.getParameter("productId"));
			Products product = dao.getProductById(productId);
			request.setAttribute("product", product);
		} else if (action.equalsIgnoreCase("list")) {
			forward = AllProduct;
			request.setAttribute("product", dao.getAllProducts());
		} else {
			forward = INSERT_OR_EDIT;
		}

		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Products products = new Products();

		try {
			Date date = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("date"));
			products.setDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		products.setProductName(request.getParameter("productName"));

		products.setPrice(Integer.parseInt(request.getParameter("price")));

		products.setUnit(Integer.parseInt(request.getParameter("unit")));

		String productId = request.getParameter("productId");

		if (productId == null || productId.isEmpty())
			dao.addProducts(products);
		else {
			products.setProductId(Integer.parseInt(productId));
			dao.updateProducts(products);
		}
		
		
		RequestDispatcher view = request.getRequestDispatcher(AllProduct);
		request.setAttribute("products", dao.getAllProducts());
		view.forward(request, response);
	}

}
