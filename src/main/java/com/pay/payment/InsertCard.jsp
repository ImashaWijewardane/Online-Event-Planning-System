<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Page</title>
    <link rel="stylesheet" href="css/payment.css">
    <link rel="icon" href="photos/logo.png">
</head>
<body>
<div class="prof">
        <a href="home.html"><img src="photos/home.png" alt="profile"></a>
    </div>
    
    <div class="container">
        <h1>Payment Details</h1>

        <form action="Payment" method="post">
	 
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br>

        <label for="cardnumber">Card Number:</label>
        <input type="text" id="cardnumber" name="cardnumber"><br>

        <label for="month">Expiry Month:</label>
        <input type="text" id="month" name="month"><br>

        <label for="year">Expiry Year:</label>
        <input type="text" id="year" name="year"><br>

        <label for="cvv">CVV:</label>
        <input type="text" id="cvv" name="cvv"><br>

        <input type="submit" value="Add Payment">
    </form>
    </div>
	 
</body>
</html>