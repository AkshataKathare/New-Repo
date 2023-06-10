<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KUD</title>
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
 
		</div>
		
		<div><a href="ImageDisplay.jsp">View Image</a></div>
		<div><a href="list">List All</a></div>
	</nav>


	<h3 style="text-align: center; color: green;">Secondary
		Pre-University Re-Evaluation Application</h3>

	<c:forEach items="${errors}" var="error">
		<span style="color: red">${error.defaultMessage}</span>
		<br>
	</c:forEach>
	<form
		style="border: solid thin; margin-left: 150px; margin-right: 150px"
		action="subm" method="post" enctype="multipart/form-data">

		<pre>
		
	    Student photo :<input type="file" name="file" />
		
	    Student Name :<input type="text" name="studentName"
				value="${dto.studentName}" />
			
	    Subject :<select name="subject">
			<option value="">Select</option>
			<option value="Physics">Phy</option>
			<option value="Chemistry">Chem</option>
			<option value="Mathematics">Math</option>
			<option value="Biology">Bio</option>
			<option value="Kannada">Kannada</option>
			<option value="English">English</option>
		</select>
		
	    College Name :<input type="text" name="collegeName"
				value="${dto.collegeName}" />
		
	    Total marks obtained :<input type="number" name="marks"
				value="${dto.marks}" />
		
		<input type="submit" value="Submit" />
		</pre>
	</form>
</body>
</html>