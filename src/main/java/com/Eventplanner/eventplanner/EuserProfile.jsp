<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Event planner List</title>
    <link rel="stylesheet" href="css/planner.css">
    <link rel="icon" href="photos/logo.png">
</head>
<body>
    <h1>EventPlanner</h1>
    <table>
   
        <c:forEach var="eve" items="${eveD}">
        
        	<c:set var = "id" value ="${eve.id}"/>
        	<c:set var = "name" value ="${eve.name}"/>
        	<c:set var = "email" value ="${eve.email}"/>
        	<c:set var = "number" value ="${eve.number}"/>
        	<c:set var = "address" value ="${eve.address}"/>
        	<c:set var = "dob" value ="${eve.dob}"/>
        	<c:set var = "uname" value ="${eve.uname}"/>
        	<c:set var = "password" value ="${eve.password}"/>
        	
        	
    <tr>
		<td> ID  </td>
		<td>${eve.id}</td>
	</tr>
	
	    <tr>
		<td> Name  </td>
		<td>${eve.name}</td>
	</tr>
	
	    <tr>
		<td> Email  </td>
		<td>${eve.email}</td>
	</tr>
	
	    <tr>
		<td> Number  </td>
		<td>${eve.number}</td>
	</tr>
	
	    <tr>
		<td> Address  </td>
		<td>${eve.address}</td>
	</tr>
	
	    <tr>
		<td> DOB  </td>
		<td>${eve.dob}</td>
	</tr>
	
	    <tr>
		<td> UserName  </td>
		<td>${eve.uname}</td>
	</tr>
	
	    <tr>
		<td> Password  </td>
		<td>${eve.password}</td>
	</tr>
         
        </c:forEach>
    </table>
    
    <c:url value = "UpdateEvent.jsp" var = "eveupdate">
    
    	<c:param name="id" value ="${id}" />
    	<c:param name="name" value ="${name}" />
    	<c:param name="email" value ="${email}" />
    	<c:param name="number" value ="${number}" />
    	<c:param name="address" value ="${address}" />
    	<c:param name="dob" value ="${dob}" />
    	<c:param name="uname" value ="${uname}" />
    	<c:param name="password" value ="${password}" />
    	
    </c:url>
    
    <a href = "${eveupdate}">
    <input type="button" name ="update" value ="update Data">
    </a>
    
    <c:url value="deleteEvent.jsp" var="evedelete">
    	
    	<c:param name="id" value ="${id}" />
    	<c:param name="name" value ="${name}" />
    	<c:param name="email" value ="${email}" />
    	<c:param name="number" value ="${number}" />
    	<c:param name="address" value ="${address}" />
    	<c:param name="dob" value ="${dob}" />
    	<c:param name="uname" value ="${uname}" />
    	<c:param name="password" value ="${password}" />
    	
    </c:url>
    <a href="${evedelete}">
    <input type="button" name="delete" value="Delete Account">
    </a>
</body>
</html>
