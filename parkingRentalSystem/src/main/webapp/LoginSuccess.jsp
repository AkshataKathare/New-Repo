<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: teal;">
		<img style="margin-left: 20px" height="50px"
			src="https://thumbs.dreamstime.com/b/flat-isolated-vector-eps-illustration-icon-minimal-design-long-shadow-parking-ticket-117821594.jpg">
		<div>
			<a class="btn btn-warning"
				style="font-size: x-large; margin-left: 700px" href="AdminLogin.jsp"
				role="submit">Log out</a>
		</div>
		<div style="color: orange; font-size: x-large; margin-right: 20px">
			User : ${userName}</div>
	</nav>
	<h3 style="color: green; text-align: center;">Login is successful</h3>

	<input type="submit" value="Parking Info" />


	<footer style="margin-top: 330px">
		<nav class="navbar navbar-light" style="background-color: teal;">
			<a style="margin-left: 400px; color: orange; font-size: x-large;">Last
				login :${loginTime}</a>
		</nav>
	</footer>
</body>
</html>