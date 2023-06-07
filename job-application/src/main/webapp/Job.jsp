<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Job Application</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
		<div class="container-fluid">
			<img height="40px"
				src="https://tse3.mm.bing.net/th?id=OIP.0OicRYTfLK0deVDnGHpc3wHaDE&pid=Api&P=0&h=180">

		</div>
	</nav>

	<h1>Application for job</h1>
	
	<c:forEach items="${errors}" var="error">
		<span style="color: red">${error.defaultMessage}</span>
		<br>
	</c:forEach>


	<form action="save" method="post">
		<pre>	
	       Job Applicant name :<input type="text" name="applName" />
	
	       Experience :<input type="number" name="experience" />
	       
	       Qualification :<select name="qualification">
	       <option value="">Select</option>
	       <option value="B.Sc">B.Sc</option>
	       <option value="B.E">B.E</option>
	       <option value="B.Com">B.Com</option>
	       <option value="B.A">B.A</option>
	       </select>
	       
	       Percentage :<input type="text" name="percentage" />
	       
	       <input type="submit" value="Save" />
	</pre>
	</form>
</body>
</html>