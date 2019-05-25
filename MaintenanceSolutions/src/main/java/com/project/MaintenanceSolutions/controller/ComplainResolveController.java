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

import com.project.MaintenanceSolutions.daoimpl.ComplainResolveDoaImpl;
import com.project.MaintenanceSolutions.modal.ComplainResolve;

/**
 * Servlet implementation class ComplainResolveController
 */
@WebServlet("/ComplainResolveController")
public class ComplainResolveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	   private static String INSERT_OR_EDIT = "/ClientResolvedData.jsp";
	    private static String LIST = "/listClientResolvedData.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	private ComplainResolveDoaImpl dao;

	public ComplainResolveController() {
		super();
		dao = new ComplainResolveDoaImpl();
	}
	
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String forward="";
	        String action = request.getParameter("action");

	        if (action.equalsIgnoreCase("delete")){
	            int resolveid = Integer.parseInt(request.getParameter("resolveid"));
	            dao.deletesolvedComplains(resolveid);
	            forward = LIST;
	            request.setAttribute("ComplainResolve", dao.getAllsolvedComplains());    
	        } else if (action.equalsIgnoreCase("edit")){
	            forward = INSERT_OR_EDIT;
	            int resolveid = Integer.parseInt(request.getParameter("resolveid"));
	            ComplainResolve ComplainResolve = dao.getResolveById(resolveid);
	            request.setAttribute("ComplainResolve", ComplainResolve);
	        } else if (action.equalsIgnoreCase("list")){
	            forward = LIST;
	            request.setAttribute("ComplainResolve", dao.getAllsolvedComplains());
	        } else {
	            forward = INSERT_OR_EDIT;
	        }

	        RequestDispatcher view = request.getRequestDispatcher(forward);
	        view.forward(request, response);
	    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ComplainResolve resolve = new ComplainResolve();

		try {
			Date date = new SimpleDateFormat("yyyy/MM/dd").parse(request.getParameter("date"));
			resolve.setDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		resolve.setEngineerName(request.getParameter("engineerName"));

		resolve.setClientMobileNo(Integer.parseInt(request.getParameter("clientMobileNo")));

		resolve.setSolution(request.getParameter("solution"));
		resolve.setPart(request.getParameter("part"));

		resolve.setCharges(Integer.parseInt(request.getParameter("charges")));

		String resolveid = request.getParameter("resolveid");

		if (resolveid == null || resolveid.isEmpty())
		{
			dao.addsolvedComplain(resolve);
		}
		  else
	        {
			  resolve.setResolveid(Integer.parseInt(resolveid));
	            dao.updatesolvedComplains(resolve);
	        }

		RequestDispatcher view = request.getRequestDispatcher(LIST);
		 request.setAttribute("ComplainResolve", dao.getAllsolvedComplains());
		view.forward(request, response);
	}

}
