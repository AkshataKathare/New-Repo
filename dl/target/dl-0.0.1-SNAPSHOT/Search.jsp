<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
</head>
<body>
	<h1>Search Page</h1>

	<form action="search" method="get">
		<pre>
Name :<input type="text" name=name />
<input type="submit" value="Search" />
</pre>
	</form>

	<table class="table">
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>City</th>
			<th>State</th>
			<th>Country</th>
			<th>File</th>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.fullName}</td>
				<td>${dto.age}</td>
				<td>${dto.city}</td>
				<td>${dto.state}</td>
				<td>${dto.country}</td>
				<td>${dto.originalFileName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>