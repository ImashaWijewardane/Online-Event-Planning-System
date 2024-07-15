<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedbacks</title>
    <link rel="stylesheet" href="css/event.css">
    <link rel="icon" href="photos/logo.png">
</head>
<body>

	<div class="prof">
        <a href="home.html"><img src="photos/home.png" alt="profile"></a>
    </div>
    
    <div class="container">
        <div class="title">
            <h1> Feedback </h1>
        </div>
        <ul>
            <li class="categ">
                <div class="cate">
                   <form action="feddbackServlet" method="post">
       
				        <label for="email">Email:</label>
				        <input type="email" name="email" id="email" required><br>
				        
				        <label for="message">Feedback:</label>
				        <textarea name="message" id="message" required></textarea><br>
				        
				        <input type="submit" value="Submit Feedback">
				        
				    </form>

                </div>
            </li>
            


    </div>
 
    

</body>
</html>
