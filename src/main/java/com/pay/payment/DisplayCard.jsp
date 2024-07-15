<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Card Details</title>
    <link rel="stylesheet" href="css/event.css">
    <link rel="icon" href="photos/logo.png">
</head>
<body>
    <table>
        <c:forEach var="card" items="${cardDetails}">
        
        
        <c:set var="id" value="${card.id}"/>
	<c:set var="name" value="${card.name}"/>
	<c:set var="cardnumber" value="${card.cardnumber}"/>
	<c:set var="month" value="${card.month}"/>
	<c:set var="year" value="${card.year}"/>
	<c:set var="cvv" value="${card.cvv}"/>
        
            <tr>
                <td>ID</td>
                <td>${card.id}</td>
            </tr>
            <tr>
                <td>Name</td>
                <td>${card.name}</td>
            </tr>
            <tr>
                <td>Card Number</td>
                <td>${card.cardnumber}</td>
            </tr>
            <tr>
                <td>Month</td>
                <td>${card.month}</td>
            </tr>
            <tr>
                <td>Year</td>
                <td>${card.year}</td>
            </tr>
            <tr>
                <td>CVV</td>
                <td>${card.cvv}</td>
            </tr>
        </c:forEach>
    </table>

    <c:url value="updatecard.jsp" var="cardDetailsUpdateURL">
        <c:param name="id" value="${cardDetail.id}" />
    </c:url>
    <a href="${cardDetailsUpdateURL}">
        <button type="button">Update My Card Details</button>
    </a>

    <c:url value="DeleteCard.jsp" var="cardDetailsDeleteURL">
        <c:param name="id" value="${cardDetail.id}" />
    </c:url>
    <a href="${cardDetailsDeleteURL}">
        <button type="button">Delete My Card Details</button>
    </a>
</body>
</html>
