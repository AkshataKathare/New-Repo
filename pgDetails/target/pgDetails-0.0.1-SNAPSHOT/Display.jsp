<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PG Details</title>
</head>
<body>

	<h1>Displaying PG Details</h1>

	<pre>
	
	<span style="color: red">${message}</span>
	<c:forEach items="${msg}" var="error">
	<c:out value="${error}"></c:out>
	</c:forEach>
	
	PG Name :${pgName}
	
	PG Owner :${pgOwner}
	
	Location :${location}
	
	Rent :${pgRent}
	
	No of Floors :${floors}

	</pre>


</body>
</html>