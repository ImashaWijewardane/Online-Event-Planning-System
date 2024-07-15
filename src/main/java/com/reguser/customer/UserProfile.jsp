<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer List</title>
    <link rel="stylesheet" href="css/event.css">
    <link rel="icon" href="photos/logo.png">
</head>
<body>
    <h1>Customer List</h1>
    <table>
   
        <c:forEach var="cus" items="${cusD}">
        
        	<c:set var = "id" value ="${cus.id}"/>
        	<c:set var = "name" value ="${cus.name}"/>
        	<c:set var = "email" value ="${cus.email}"/>
        	<c:set var = "number" value ="${cus.number}"/>
        	<c:set var = "address" value ="${cus.address}"/>
        	<c:set var = "dob" value ="${cus.dob}"/>
        	<c:set var = "uname" value ="${cus.uname}"/>
        	<c:set var = "password" value ="${cus.password}"/>
        	
        	
    <tr>
		<td> ID - </td>
		<td>${cus.id}</td>
	</tr>
	
	    <tr>
		<td> Name  </td>
		<td>${cus.name}</td>
	</tr>
	
	    <tr>
		<td> Email  </td>
		<td>${cus.email}</td>
	</tr>
	
	    <tr>
		<td> Number  </td>
		<td>${cus.number}</td>
	</tr>
	
	    <tr>
		<td> Address  </td>
		<td>${cus.address}</td>
	</tr>
	
	    <tr>
		<td> DOB  </td>
		<td>${cus.dob}</td>
	</tr>
	
	    <tr>
		<td> UserName  </td>
		<td>${cus.uname}</td>
	</tr>
	
	    <tr>
		<td> Password  </td>
		<td>${cus.password}</td>
	</tr>
         
        </c:forEach>
    </table>
    
    <c:url value = "Updatecustomer.jsp" var = "cusupdate">
    
    	<c:param name="id" value ="${id}" />
    	<c:param name="name" value ="${name}" />
    	<c:param name="email" value ="${email}" />
    	<c:param name="number" value ="${number}" />
    	<c:param name="address" value ="${address}" />
    	<c:param name="dob" value ="${dob}" />
    	<c:param name="uname" value ="${uname}" />
    	<c:param name="password" value ="${password}" />
    	
    </c:url>
    
    <a href = "${cusupdate}">
    <input type="button" name ="update" value ="update Data">
    </a>
    
    <c:url value="deletecustomer.jsp" var="cusdelete">
    	
    	<c:param name="id" value ="${id}" />
    	<c:param name="name" value ="${name}" />
    	<c:param name="email" value ="${email}" />
    	<c:param name="number" value ="${number}" />
    	<c:param name="address" value ="${address}" />
    	<c:param name="dob" value ="${dob}" />
    	<c:param name="uname" value ="${uname}" />
    	<c:param name="password" value ="${password}" />
    	
    </c:url>
    <a href="${cusdelete}">
    <input type="button" name="delete" value="Delete Account">
    </a>
</body>
</html>
