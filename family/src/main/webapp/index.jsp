<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

	<h1 style="margin-left: 50px">My Family</h1>

	<form method="post" action="subm">
		<pre>
		My name :<input type="text" name="myName" />
		
		Father Name :<input type="text" name="fatherName" />
		
		Father Occupation :<input type="text" name="fatherOccup" />
		
		Mother Name :<input type="text" name="motherName" />
		
		Mother Occupation :<input type="text" name="motherOccup" />
		
		Sister Name :<input type="text" name="sisterName" />
		
		Sister is pursuing :<input type="text" name="sisterPursuing" />
		
		Brother Name :<input type="text" name="brotherName" />
		
		Brother Occupation :<input type="text" name="brotherPursuing" />
		
		Sur name :<input type="text" name="surname" />
		
		<input type="submit" name="Submit" />
		</pre>
	</form>
</body>

</html>