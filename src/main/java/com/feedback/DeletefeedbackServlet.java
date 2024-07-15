package com.feedback;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeletefeedbackServlet")
public class DeletefeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = feedbackDB.deletefeedback(id);
		
		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("feedback.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<feedback> feedDetails = feedbackDB.getfeedbackDetails(id);
			request.setAttribute("feedDetails", feedDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("displayfeedback.jsp");
			dis.forward(request, response);
		}
	}




	}


