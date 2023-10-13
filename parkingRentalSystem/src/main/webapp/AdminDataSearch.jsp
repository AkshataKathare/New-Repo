<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
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
			<a style="margin-left: 800px" class="btn btn-warning"
				href="LoginSuccess.jsp" role="button">Home</a>
		</div>
		<div style="color: orange; font-size: x-large; margin-right: 20px">
			User,${dto.name}</div>
	</nav>


	<form
		style="border: 1px solid white; margin-left: 400px; margin-right: 400px;"
		action="search" method="get">
		<pre>
		LOCATION<select class="form-select" name="location">
			<option value="">Select</option>
			<option value="Rajajinagar">Rajajinagar</option>
			<option value="BTM">BTM</option>
			<option value="Vijaynagar">Vijaynagar</option>
			<option value="Basavangudi">Basavangudi</option>
			<option value="Kormangala">Kormangala</option>
		</select> 
		<input class="btn-success" type="submit" value="Search" />
		</pre>
	</form>
	<table class="table table-success table-striped"
		style="margin-bottom: 80px">
		<tr>
			<th>Location</th>
			<th>Vehicle Type</th>
			<th>Vehicle Classification</th>
			<th>Term</th>
			<th>Price</th>
			<th>Discount</th>
		</tr>

		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.location}</td>
				<td>${dto.vehicleType}</td>
				<td>${dto.vehicleClassification}</td>
				<td>${dto.term}</td>
				<td>${dto.price}</td>
				<td>${dto.discountInPercentage}</td>
			</tr>
		</c:forEach>

	</table>


	<div class="footer fixed-bottom">
		<nav class="navbar navbar-light" style="background-color: teal;">
			<h6 style="margin-left: 250px;">
				© 2023 Copyright Parking website <span style="color: white;">${dto.email}</span>
				Last login :${dto.loginTime}
			</h6>
		</nav>
	</div>

</body>
</html>