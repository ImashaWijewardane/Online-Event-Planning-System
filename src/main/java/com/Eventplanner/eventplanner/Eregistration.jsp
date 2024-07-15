<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event planner Registration</title>
<link rel="stylesheet" href="css/event.css">
    <link rel="icon" href="photos/logo.png">
</head>
<body>

    <form action="EregistrationServlet" method="post">
    
        Fist Name <input type="text" name="name"><br>
        Last Name <input type="text" name="lname"><br>
        Email <input type="text" name="email"><br>
        Phone Number <input type="text" name="pnum"><br>
        Address <input type="text" name="address"><br>
        DOB <input type="text" name="dob"><br>
        User Name <input type="text" name="uid"><br>
        Password <input type="text" name="pass"><br>
        
        
        <input type="submit" name="Registration" value="Create Customer"><br>
        
    </form>
    
</body>
</html>
