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
<style type="text/css">
body {
	background-color: linen;
}
</style>
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: olive;">
		<div class="container-fluid">
			<img height="40px"
				src="https://tse3.mm.bing.net/th?id=OIP.0OicRYTfLK0deVDnGHpc3wHaDE&pid=Api&P=0&h=180">
			<a href="Image.jsp" style="color: maroon;">Download the file from
				here</a>
		</div>
	</nav>

	<h1 style="text-align: center; color: navy; font-style: oblique;">Application
		for job</h1>

	<c:forEach items="${errors}" var="error">
		<span style="color: red">${error.defaultMessage}</span>
		<br>
	</c:forEach>


	<form
		style="border: solid 2px purple; margin-left: 110px; margin-right: 110px"
		action="save" method="post" enctype="multipart/form-data">
		<pre>	
	       Job Applicant name :<input class="inputClass" type="text"
				name="applName" value="${dto.applName}" />
	
	       Experience :<input class="inputClass" type="number"
				name="experience" value="${dto.experience}" />
	       
	       Qualification :<select class="inputClass" name="qualification">
	       <option value="">Select</option>
	       <option value="B.Sc">B.Sc</option>
	       <option value="B.E">B.E</option>
	       <option value="B.Com">B.Com</option>
	       <option value="B.A">B.A</option>
	       </select>
	       
	       Percentage :<input class="inputClass" type="text"
				name="percentage" value="${dto.percentage}" />
	
	       Select File : <input type="file" name="file" />
	       
	       <input class="btn btn-info" type="submit" value="Save" />
	</pre>
	</form>
</body>
</html>


