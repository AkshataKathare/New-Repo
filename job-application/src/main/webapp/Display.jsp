<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Job Apllication</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: olive;">
		<div class="container-fluid">
			<img height="40px"
				src="https://tse3.mm.bing.net/th?id=OIP.0OicRYTfLK0deVDnGHpc3wHaDE&pid=Api&P=0&h=180">
			<a href="Job.jsp" style="color: black; font-size: xlarge;">Home</a>
		</div>
	</nav>
	<h1 style="text-align: center;">Submit Response</h1>

	<br>
	<div style="font-style: italic; text-indent: 65px;">
		<span style="color: green;">${msg}</span>
	</div>
	<br>
	<pre style="border: solid thin; margin-left: 90px; margin-right: 90px">
	Applicant name :${dtos.applName}
	
	Experience : ${dtos.experience}
	
	Qualification :${dtos.qualification}
	
	Percentage : ${dtos.percentage}
	
	</pre>
</body>
</html>