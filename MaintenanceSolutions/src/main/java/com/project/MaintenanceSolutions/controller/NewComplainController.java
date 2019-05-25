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

import com.project.MaintenanceSolutions.daoimpl.NewComplainDaoImpl;
import com.project.MaintenanceSolutions.modal.NewComplain;

@WebServlet("/NewComplainController")
public class NewComplainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "/addNewComplain.jsp";
	private static String LIST = "/complainList.jsp";
	private NewComplainDaoImpl dao;

	public NewComplainController() {
		super();
		dao = new NewComplainDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("delete")) {
			int complainId = Integer.parseInt(request.getParameter("complainId"));
			dao.deleteNewComplains(complainId);
			forward = LIST;
			request.setAttribute("complains", dao.getAllNewComplains());
		} else if (action.equalsIgnoreCase("edit")) {
			forward = INSERT_OR_EDIT;
			int complainid = Integer.parseInt(request.getParameter("complainid"));
			NewComplain complain = dao.getNewComplainById(complainid);
			request.setAttribute("complain", complain);
		} else if (action.equalsIgnoreCase("list")) {
			forward = LIST;
			request.setAttribute("engineer", dao.getAllNewComplains());
		} else {
			forward = INSERT_OR_EDIT;
		}

		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		NewComplain complain = new NewComplain();



		complain.setComplainer(request.getParameter("complainer"));
		complain.setFridgeType(request.getParameter("fridgeType"));
		complain.setIssue(request.getParameter("issue"));
		complain.setEmail(request.getParameter("email"));
		complain.setMobileNo(Integer.parseInt(request.getParameter("mobileNo")));
		complain.setAddress(request.getParameter("address"));

		try {
			Date date = new SimpleDateFormat("yyyy/MM/dd").parse(request.getParameter("appDate"));
			complain.setAppDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		complain.setAppSlot(request.getParameter("appSlot"));

		String complainId = request.getParameter("complainid");

		if (complainId == null || complainId.isEmpty()) {

			dao.addNewComplains(complain);
		} else {
			complain.setComplainId(Integer.parseInt(complainId));
			dao.updateNewComplains(complain);
		}

		RequestDispatcher view = request.getRequestDispatcher(LIST);
		request.setAttribute("complains", dao.getAllNewComplains());
		view.forward(request, response);
	}

}
