<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Update Event planner</title>
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
	<form action="EupdateServlet" method="post">
	
	Event Planner ID <input type="text" name="id" value="<%= id %>" readonly><br>
	Name <input type="text" name="name" value="<%= name %>"><br>
	Email <input type="text" name="email" value="<%= email %>"><br>
	Number <input type="text" name="number" value="<%= number %>"><br>
	Address <input type="text" name="address" value="<%= address %>"><br>
	DOB <input type="text" name="dob" value="<%= dob %>"><br>
	User Name <input type="text" name="uname" value="<%= uname %>"><br>
	Password <input type="text" name="password" value="<%= password %>"><br>
	
	<input type="submit" name="submit" value="Update profile"><br>
	</form>
	
</body>

</html>