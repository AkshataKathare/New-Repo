<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Re-evaluation</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style type="text/css">
form {
	background-color: linen;
}
</style>
</head>
<body>

	<nav class="navbar navbar-light" style="background-color: maroon;">
		<div class="container-fluid">
			<img height="40px"
				src="https://preparmy.com/wp-content/uploads/2017/04/KUD-Logo.png">
			<a href="Evaluation.jsp">Home</a>
		</div>
	</nav>
	<h1 style="color: maroon; text-align: center;">Display List</h1>


	<table class="table">
		<tr>
			<th>Name</th>
			<th>College Name</th>
			<th>Subject</th>
			<th>Marks Obtained</th>
			<th>File</th>
		</tr>

		<c:forEach items="${dtos}" var="dto">
			<tr>
				<td>${dto.studentName}</td>
				<td>${dto.collegeName}</td>
				<td>${dto.subject}</td>
				<td>${dto.marks}</td>
				<td><a target="_blank"
					href="fileDownload?fileName=${dto.fileName}&contentType=${dto.contentType}"
					onclick="${dto.fileName}">file</a></td>
			</tr>

		</c:forEach>


	</table>




</body>
</html>