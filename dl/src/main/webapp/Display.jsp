<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Data Entered</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: teal;">
		<div>
			<img height="50px"
				src="https://tse1.mm.bing.net/th?id=OIP.29m-3-T3tLDplFTJWbl8NgAAAA&pid=Api&P=0&h=180">

			<a style="margin-left: 40px; color: yellow; margin-left: 40px;"
				href="DriveLicense.jsp">Home Page</a> <a
				style="color: yellow; margin-left: 40px" href="showInList">Table
				Format</a>
		</div>
	</nav>
	<h1>View your details</h1>

	<span style="color: green;">${successMsg}</span>

	<pre>
         Name :${dto.fullName}
         
         Age :${dto.age}
         
         City :${dto.city}
         
         State :${dto.state}
         
         Country :${dto.country}
        
         </pre>
</body>
</html>