<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/event.css">
    <link rel="icon" href="photos/logo.png">
</head>
<body>

	<%
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String message = request.getParameter("message");

	%>
	<form action="UpdatefeedbackServlet" method="post">
	ID <input type="text" name="id" value="<%= id %>" readonly><br>
	Email <input type="text" name="email" value="<%= email %>"><br>
	Message <input type="text" name="message" value="<%= message %>"><br>
	
	<input type="submit" name="submit" value="Update Feedback"><br>
	</form>
	
</body>
</html>