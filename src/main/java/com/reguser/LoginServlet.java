package com.reguser;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		
		try {
		List <Customer> cusD = regUserDBUtil.validate(username, password); // validation for user-name and password
		
		if(cusD!= null && !cusD.isEmpty()) {
			
			request.setAttribute("cusD", cusD);
			
			RequestDispatcher dis = request.getRequestDispatcher("UserProfile.jsp");
			 dis.forward(request, response);
		}
		else {
			
			 request.setAttribute("loginError", "Invalid username or password");
             RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
             dis.forward(request, response);
		}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		 
	}
}