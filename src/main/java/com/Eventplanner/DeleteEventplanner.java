package com.Eventplanner;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteEventplanner")
public class DeleteEventplanner extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = EventplannerDB.deleteeventplanner(id);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("Eregistration.jsp");
			dis.forward(request, response);
			
		}
		else {
			
			List<Eventplanner> eveD = EventplannerDB.geteventplannerDetails(id);
			request.setAttribute("eveD",eveD);
			
			RequestDispatcher dis = request.getRequestDispatcher("EuserProfile.jsp");
			dis.forward(request, response);
			
		}

		
		
	}
	}


