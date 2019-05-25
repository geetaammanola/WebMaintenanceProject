package com.project.MaintenanceSolutions.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.MaintenanceSolutions.daoimpl.EngineerDoaImpl;
import com.project.MaintenanceSolutions.modal.Engineer;

@WebServlet("/EngineerController")
public class EngineerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String INSERT_OR_EDIT = "/addNewEngineer.jsp";
	private static String LIST = "/engineerList.jsp";
	private EngineerDoaImpl dao;

	public EngineerController() {
		super();
		dao = new EngineerDoaImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("delete")) {
			int engineerId = Integer.parseInt(request.getParameter("engineerId"));
			dao.deleteEngineers(engineerId);
			forward = LIST;
			request.setAttribute("engineers", dao.getAllEngineers());
		} else if (action.equalsIgnoreCase("edit")) {
			forward = INSERT_OR_EDIT;
			int engineerId = Integer.parseInt(request.getParameter("engineerId"));
			Engineer engineer = dao.getEngineersById(engineerId);
			request.setAttribute("engineer", engineer);
		} else if (action.equalsIgnoreCase("list")) {
			forward = LIST;
			request.setAttribute("engineer", dao.getAllEngineers());
		} else {
			forward = INSERT_OR_EDIT;
		}

		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
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
