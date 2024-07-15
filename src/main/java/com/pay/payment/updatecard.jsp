<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
	<%
	
	String id = request.getParameter("id");
	String name = request.getParameter("name");
    String cardNum = request.getParameter("cardNum");
    String month = request.getParameter("month");
    String year = request.getParameter("year");
    String cvv = request.getParameter("cvv");
		
		
	%>
	
	<form action="Upay" method="post">
	
	ID <input type="text" name="id" value="<%= id %>" readonly><br>
	Name <input type="text" name="name" value="<%= name %>" ><br>
	Card NO <input type="text" name="cardNum" value="<%= cardNum %>" ><br>
	Month <input type="text" name="month" value="<%= month %>" ><br>
	Year <input type="text" name="year" value="<%= year %>" ><br>
	CVV <input type="text" name="cvv" value="<%= cvv %>" ><br>
	
	<input type="submit" name="submit" value="Update cardDetails"><br>
	
	</form>
	
</body>
</html>