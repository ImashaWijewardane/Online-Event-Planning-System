<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event planner Login</title>
<link rel="stylesheet" href="css/Login.css">
    <link rel="icon" href="photos/logo.png">
<script>

function validateForm() {
	
    var username = document.forms["loginForm"]["uid"].value;
    var password = document.forms["loginForm"]["pass"].value;

    if (username === "" || password === "") {
        alert("Username and password are required");
        return false; 
    }
 
    

    return true; 
}
</script>

</head>
<body>
	
		
		
		<section>


        <div class="login-container">

            <h1>Sign In</h1>

            <form action="EloginServlet" method = "post" onsubmit="return validateForm()">
		
			User Name <input type = "text" name = "uid"><br>
			Password <input type = "password" name = "pass"><br>
			
			<input type = "submit" name = "submit" value = "Login"><br>
			
		</form>
            <div class="register-link">
                <p>Don't have an account <a href="signup.html">Register</a></p>
            </div>
            <center>
                <div class="register-link">
                    <p><a href="home.jsp">Back to Home</a></p>
                </div>
            </center>

        </div>

    </section>
		
		
</body>
</html>