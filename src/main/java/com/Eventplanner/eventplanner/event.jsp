<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event Planning</title>
    <link rel="stylesheet" href="css/event.css">
    <link rel="icon" href="photos/logo.png">
</head>
<body>
    <div class="prof">
        <a href="home.html"><img src="photos/home.png" alt="profile"></a>
    </div>
    <div class="container">
        <div class="title">
            <h1> Get Your Event Planned </h1>
        </div>
        <ul>
            <li class="categ">
                <div class="cate">
                    <label for="cate">Select the Your Event Type</label>
                    <select id="catego" name="catego" required style="width:200px;">
                        <option value="">Weddings</option>
                        <option value="">DJ Parties</option>
                        <option value="">Music Festivals</option>
                        <option value="">Global Events</option>
                        <option value="">Social Events</option>
                        <option value="">Official Events</option>
                    </select>

                </div>
            </li>
            <br>
            <li class="dte">
                <div class="date">
                    <label for="date">Enter the date&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                    <input type="date" id="date" style="width:180px" name="date" required>
                </div>
                <br>
            </li>
            <li class="msg">
                <div class="text">
                    <label for="text">Enter the venue</label>
                    <textarea></textarea>
                </div>
            </li>
            <li class="msg">
                <div class="text">
                    <label for="text">Decorations</label>
                    <textarea></textarea>
                </div>
            </li>
            <li class="msg">
                <div class="text">
                    <label for="text">Entertainment</label>
                    <textarea></textarea>
                </div>
            </li>
            <li class="msg">
                <div class="text">
                    <label for="text">Artists to be Invited</label>
                    <textarea></textarea>
                </div>
            </li>
        </ul>
        <br>

        <div class="booking">
            <a href="displaycarddetails.jsp"><button type="submit">Place Order</button></a>
        </div>


    </div>

</body>
</html>