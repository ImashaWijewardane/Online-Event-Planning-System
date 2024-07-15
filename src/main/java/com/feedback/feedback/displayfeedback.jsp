<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Feedback Details</title>
<link rel="stylesheet" href="css/planner.css">
    <link rel="icon" href="photos/logo.png">
</head>
<body>
	
	<table>
	<c:forEach var="feed" items="${feedDetails}">
	
	<c:set var="id" value="${feed.id}"/>
	<c:set var="email" value="${feed.email}"/>
	<c:set var="message" value="${feed.message}"/>
	
	
	<tr>
		<td> ID</td>
		<td>${feed.id}</td>
	</tr>
	
	<tr>
		<td>Email</td>
		<td>${feed.email}</td>
	</tr>
	
	<tr>
		<td>Message </td>
		<td>${feed.message}</td>
	</tr>
	
	</c:forEach>
	</table>
	
	<c:url value = "updatefeedback.jsp" var = "feedupdate">
		<c:param name = "id" value = "${id}"/>
		<c:param name = "email" value = "${email}"/>
		<c:param name = "message" value = "${message}"/>
		
	</c:url>
	
	
	<a href = "${feedupdate}">
	<input type = "button" name = "update" value = "Update My Feedbck">
	</a>
	<br>
	
	<c:url value="deletefeedback.jsp" var="feeddelete">
		<c:param name = "id" value = "${id}"/>
		<c:param name = "email" value = "${email}"/>
		<c:param name = "message" value = "${message}"/>
		
	</c:url>
	<a href="${feeddelete}">
	<input type="button" name="delete" value="Delete My Feedback">
	</a>
	
	
	
	
</body>
</html>