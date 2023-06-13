<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PG details</title>
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

	<h1>Details of PG</h1>

	<c:forEach items="${errors}" var="error">
		<span style="color: red;">${error.defaultMessage}</span>
		</br>
	</c:forEach>


	<span style="color: green;">${successMsg}</span>

	<form action="save" method="post">
		<pre>
		
	    PG Name :<input type="text" name="pgName" />
	    
	    PG Owner :<input type="text" name="pgOwner" />
	    
	    Location :<input type="text" name="location" />
	    
	    PG rent :<input type="text" name="pgRent" />
	    
	    No of floors :<input type="text" name="noOfFloors" />
	    
	    <input type="submit" value="Save" />


        </pre>
	</form>
</body>
</html>