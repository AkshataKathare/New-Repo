<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<h1>View</h1>

	Total data saved :${list.size()}
	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Country</th>
				<th scope="col">Mobile No</th>
				<th scope="col">Type</th>
				<th scope="col">Description</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">


				<tr>
					<th scope="row"><c:out value="${dto.fullName}"></c:out></th>
					<td><c:out value="${dto.email}"></c:out></td>
					<td><c:out value="${dto.country}"></c:out></td>
					<td><c:out value="${dto.contactNo}"></c:out></td>
					<td><c:out value="${dto.type}"></c:out></td>
					<td><c:out value="${dto.description}"></c:out></td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</body>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</html>