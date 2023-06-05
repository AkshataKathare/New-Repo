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
			<a class="navbar-brand" href="index.jsp.jsp">Go to home</a> <a
				class="navbar-brand" href="view">Go to view</a>
		</div>
	</nav>
	<h1>Displaying the details</h1>

	<pre>

     My name : ${name}

     Father name :${father}

     Father Occupation :${fatherOccup}

     Mother Name :${mother}

     Mother Occupation :${motherOccup}

     Sister name :${sister}

     Sister is pursuing :${sisterPurs}

     Brother Name :${brother}

     Brother is pursuing :${brotherPurs}
     
     Surname :${surname}

</pre>
</body>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</html>