package com.project.MaintenanceSolutions.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.MaintenanceSolutions.daoimpl.UserLoginDaoImpl;
import com.project.MaintenanceSolutions.modal.userLogin;


@WebServlet("/login")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UserLoginDaoImpl dao = new UserLoginDaoImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(uname.equals("Admin") && pass.equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("addNewComplain.jsp");
		}
		else if(dao.checkUser(uname,pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("ClientResolvedData.jsp");
		}else
		{
			response.sendRedirect("login.jsp");
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		userLogin userLogin = new userLogin();

		userLogin.setName(request.getParameter("name"));
		userLogin.setEmail(request.getParameter("email"));
		userLogin.setPassword(request.getParameter("password"));
	
			dao.addUserLogin(userLogin);
			response.sendRedirect("login.jsp");
		}

		
	}
	
	

