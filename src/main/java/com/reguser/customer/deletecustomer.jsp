<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Account Delete</title>
<link rel="stylesheet" href="css/event.css">
    <link rel="icon" href="photos/logo.png">
</head>
<body>

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String number = request.getParameter("number");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
	%>
	
	<form action="DeleteCustomerServlet" method="post">
	
	Student ID <input type="text" name="id" value="<%= id %>" readonly><br>
	Name <input type="text" name="name" value="<%= name %>" readonly><br>
	Email <input type="text" name="email" value="<%= email %>" readonly><br>
	Number <input type="text" name="number" value="<%= number %>" readonly><br>
	Address <input type="text" name="address" value="<%= address %>" readonly><br>
	DOB <input type="text" name="dob" value="<%= dob %>" readonly><br>
	User Name <input type="text" name="uname" value="<%= uname %>" readonly><br>
	
	<input type="submit" name="submit" value="Delete profile"><br>
	
	</form>
	
</body>
</html>