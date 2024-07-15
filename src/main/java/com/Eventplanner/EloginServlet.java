package com.Eventplanner;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EloginServlet")
public class EloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		
		try {
		List <Eventplanner> eveD = EventplannerDB.validate(username, password);
		
		if(eveD!= null && !eveD.isEmpty()) {
			
			request.setAttribute("eveD", eveD);
			
			RequestDispatcher dis = request.getRequestDispatcher("EuserProfile.jsp");
			 dis.forward(request, response);
		}
		else {
			
			 request.setAttribute("loginError", "Invalid username or password");
             RequestDispatcher dis = request.getRequestDispatcher("Elogin.jsp");
             dis.forward(request, response);
		}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		 
	}
	

}
