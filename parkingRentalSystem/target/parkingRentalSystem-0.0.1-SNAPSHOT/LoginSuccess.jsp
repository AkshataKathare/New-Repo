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
			<a class="btn btn-warning" style="margin-left: 770px"
				href="AdminLogin.jsp" role="submit">Log out</a>
		</div>
		<div style="color: orange; font-size: x-large; margin-right: 20px">
			User,${dto.name}</div>
	</nav>
	<pre>
	
<a class="btn btn-secondary" href="AdminParkingInfo.jsp" role="button">Parking Info</a>
   
<a class="btn btn-secondary" href="AdminDataSearch.jsp" role="button">Search By Location</a>
</pre>

	<div style="size: 1" class="footer fixed-bottom">
	<nav class="navbar navbar-light" style="background-color: teal;">
	<h6 style="margin-left:  250px;">© 2023 Copyright Parking website <span style="color: orange;">${dto.email}</span>  Last login :${dto.loginTime}</h6>
		</nav> 
	</div>
</body>
</html>