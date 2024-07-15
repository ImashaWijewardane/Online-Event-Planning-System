package com.pay;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Upay")
public class Upay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String cardnumber = request.getParameter("cardnumber");
		String month = request.getParameter("month");
		String year = request.getParameter("year");
		String cvv = request.getParameter("cvv");
		
		
		
		boolean isTrue;
		
		isTrue = PaymentDB.updatecard(id, name, cardnumber, month, year, cvv);
		
		if(isTrue == true) {
			
			List<Pay> cardDetails = PaymentDB.getCardDetails(id);
			request.setAttribute("cardDetails",cardDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("DisplayCard.jsp");
			dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("Unsuccess.jsp");
			dis2.forward(request, response);
		}
	}
	
	

}
