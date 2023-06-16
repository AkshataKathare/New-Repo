<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Info</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: purple;">
		<div>
			<img height="40px"
				src="https://tse2.mm.bing.net/th?id=OIP.cJIVil0nuf3Jvn_DoDXivQHaG0&pid=Api&P=0&h=180">
			<a style="color: white; margin-left: 40px;" href="onStart">Home</a>
		</div>
	</nav>
	<h1>Success Page</h1>

	<span style="color: green;">${successMsg}</span>
	<pre>
     Name :${dto.name}
     
     Email ID :${dto.email}
     
     Mobile No :${dto.mobile}
     </pre>
</body>
</html>