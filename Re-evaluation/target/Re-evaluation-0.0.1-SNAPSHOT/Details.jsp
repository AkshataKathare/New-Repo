<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Re-evaluation</title>
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
			<a href="Evaluation.jsp">Home</a>
		</div>
	</nav>
	<h1 style="color: maroon; text-align: center;">Submission Form</h1>

	<span style="color: green; text-indent: 40px">${msg}</span>

	<pre
		style="border: solid 2px; margin-left: 120px; margin-right: 120px; background-color: linen">
	Student Name :${dtos.studentName}
	
	Subject :${dtos.subject}
	
	College Name :${dtos.collegeName}
	
	Marks obtained :${dtos.marks} 
	</pre>
</body>
</html>