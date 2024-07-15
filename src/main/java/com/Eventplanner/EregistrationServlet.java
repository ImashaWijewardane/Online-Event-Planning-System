package com.Eventplanner;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EregistrationServlet")
public class EregistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String Pname = request.getParameter("pname");
		String email = request.getParameter("email");
		String pnumber = request.getParameter("pnum");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		String username = request.getParameter("uid");
		String Password = request.getParameter("pass");
		
		
		
		boolean isTrue;
		
		isTrue = EventplannerDB.inserteventplanner(name, Pname, email, pnumber, address, dob, username, Password);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("Elogin.jsp");
			dis.forward(request, response);
			
		}
		else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("Unsuccess.jsp");
			dis2.forward(request, response);
			
		}
	}

}
