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

	Total data saved :${allDetails.size()}
	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Father Name</th>
				<th scope="col">Father Occupation</th>
				<th scope="col">Mother Name</th>
				<th scope="col">Mother Occupation</th>
				<th scope="col">Sister Name</th>
				<th scope="col">Sister Pursuing</th>
				<th scope="col">Brother Name</th>
				<th scope="col">Brother Pursuing</th>
				<th scope="col">Surname</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allDetails}" var="dto">


				<tr>
					<th scope="row"><c:out value="${dto.myName}"></c:out></th>
					<td><c:out value="${dto.fatherName}"></c:out></td>
					<td><c:out value="${dto.fatherOccup}"></c:out></td>
					<td><c:out value="${dto.motherName}"></c:out></td>
					<td><c:out value="${dto.motherOccup}"></c:out></td>
					<td><c:out value="${dto.sisterName}"></c:out></td>
					<td><c:out value="${dto.sisterPursuing}"></c:out></td>
					<td><c:out value="${dto.brotherName}"></c:out></td>
					<td><c:out value="${dto.brotherPursuing}"></c:out></td>
					<td><c:out value="${dto.surname}"></c:out></td>
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