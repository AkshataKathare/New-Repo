<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: teal;">
		<pre><img style="margin-left: 20px" height="50px" src="https://thumbs.dreamstime.com/b/flat-isolated-vector-eps-illustration-icon-minimal-design-long-shadow-parking-ticket-117821594.jpg"> <a class="btn btn-warning" href="User.jsp" role="button">Home</a></pre>
	</nav>

	<pre> </pre>
	<form
		style="border: solid black 1px; margin-left: 280px; background-color: silver; margin-right: 280px; margin-bottom: 80px"
		action="generateOTP" method="get">
	     <span style="color: green">${otpGenerated}</span>
         <span style="color: red">${otpNotGenerated}</span>
         <span style="color: red">${otpExpired}</span>
		<pre> <input class="form-control"
				onchange="return validateEmail()" type="text" name="userEmail"
				id="userEmail" placeholder="Email ID" /><input type="submit"
				value="GenerateOTP" />
		</pre>
	</form>
	<form
		style="border: solid black 1px; margin-left: 280px; background-color: silver; margin-right: 280px; margin-bottom: 80px"
		action="send" method="post">
		<pre>  <input class="form-control" type="number" name="otp"
				placeholder="OTP" /><span style="color: red">${incorrectOTP}</span>
	<input class="btn btn-success" type="submit" value="Send" />
		</pre>
	</form>


	<div class="footer fixed-bottom">
		<nav class="navbar navbar-light" style="background-color: teal;">
			<h6 style="margin-left: 450px;">© 2023 Copyright Parking website</h6>
		</nav>
	</div>
</body>
</html>