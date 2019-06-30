package com.project.MaintenanceSolutions.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.MaintenanceSolutions.daoimpl.NewAccountDaoImpl;
import com.project.MaintenanceSolutions.modal.Engineer;

/**
 * Servlet implementation class NewAccount
 */
@WebServlet("/NewAccount")
public class NewAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private NewAccountDaoImpl dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Engineer engineer = new Engineer();

		engineer.setName(request.getParameter("name"));
		engineer.setEmail(request.getParameter("email"));
		engineer.setMobileNo(Integer.parseInt(request.getParameter("mobileNo")));

		engineer.setAddress(request.getParameter("address"));
		String engineerId = request.getParameter("employeeId");

		if (engineerId == null || engineerId.isEmpty()) {
			dao.addEngineers(engineer);
		} else {
			engineer.setEngineerId(Integer.parseInt(engineerId));
			dao.updateEngineers(engineer);
		}

		RequestDispatcher view = request.getRequestDispatcher(LIST);
		request.setAttribute("engineers", dao.getAllEngineers());
		view.forward(request, response);
	}

}
