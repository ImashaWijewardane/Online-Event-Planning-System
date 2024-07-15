package com.feedback;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/feddbackServlet")
public class feddbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String email = request.getParameter("email");
	     String message = request.getParameter("message");
	     
	     boolean isTrue;
			
			isTrue = feedbackDB.insertfeedback(email,message);
			
			if(isTrue == true) 
			{
				
				List<feedback> feedDetails = feedbackDB.validate(email, message);
				request.setAttribute("feedDetails", feedDetails);
				
				
				RequestDispatcher dis = request.getRequestDispatcher("displayfeedback.jsp");
				dis.forward(request, response);
				
			}
			
			else 
			{
				
				RequestDispatcher dis2 = request.getRequestDispatcher("displayfeedback.jsp");
				dis2.forward(request, response);
				
			}
		}
	        
}
