<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PG Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Go to home</a> <a
				class="navbar-brand" href="view">Go to view</a>
		</div>
	</nav>
	<h1>Displaying PG Details</h1>

	<pre>
	
	<span style="color: red">${message}</span>
	<c:forEach items="${msg}" var="error">
	<c:out value="${error}"></c:out>
	</c:forEach>
	
	PG Name :${data.pgName}
	
	PG Owner :${data.pgOwner}
	
	Location :${data.location}
	
	Rent :${data.pgRent}
	
	No of Floors :${data.noOfFloors}

	</pre>


</body>
</html>