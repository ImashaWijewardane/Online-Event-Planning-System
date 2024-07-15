<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.body{
    background-image: url(../photos/background1.jpg);
    background-size: cover;
    background-position: center;
    background-attachment: fixed;
    width: auto;
}

</style>
</head>
<body class="body">

	<h1>Delete All Data</h1>

	<%
	
	String id = request.getParameter("id");
	String name = request.getParameter("name");
    String cardNum = request.getParameter("cardNum");
    String month = request.getParameter("month");
    String year = request.getParameter("year");
    String cvv = request.getParameter("cvv");
		
		
	%>
	
	<form action="Dpay" method="post">
	
	ID <input type="text" name="id" value="<%= id %>" readonly><br>
	Name <input type="text" name="name" value="<%= name %>" readonly><br>
	Card NO <input type="text" name="cardNum" value="<%= cardNum %>" readonly><br>
	Month <input type="text" name="month" value="<%= month %>" readonly><br>
	Year <input type="text" name="year" value="<%= year %>" readonly><br>
	CVV <input type="text" name="cvv" value="<%= cvv %>" readonly><br>
	
	<input type="submit" name="submit" value="Delete cardDetails"><br>
	
	</form>
	   
   
	
</body>
</html>