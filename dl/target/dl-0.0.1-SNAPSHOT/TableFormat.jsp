<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DL</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: teal;">
		<div>
			<img height="50px"
				src="https://tse1.mm.bing.net/th?id=OIP.29m-3-T3tLDplFTJWbl8NgAAAA&pid=Api&P=0&h=180">
			<a style="margin-left: 40px; color: yellow; margin-left: 40px;"
				href="DriveLicense.jsp">Home Page</a>
		</div>
	</nav>
	<h1 style="text-align: center;">Data in Table format</h1>

	Total data saved :${dtos.size()}
	<table class="table table-secondary table-striped">
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>City</th>
			<th>State</th>
			<th>Country</th>
			<th>File</th>
		</tr>

		<c:forEach items="${dtos}" var="dto">
			<tr>
				<td>${dto.fullName}</td>
				<td>${dto.age}</td>
				<td>${dto.city}</td>
				<td>${dto.state}</td>
				<td>${dto.country}</td>
				<td><a target="_blank"
					href="downloadFile?fileName=${dto.fileName}&contentType=${dto.contentType}"
					onclick="${dto.fileName}">${dto.originalName}</a></td>
			</tr>

		</c:forEach>


	</table>


</body>
</html>