<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Download Page</title>
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
				style="margin-left: 40px; color: yellow; margin-left: 40px;"
				href="TableFormat.jsp">Table Format Page</a>
		</div>
	</nav>
	<form action="downloadFile" method="get">
		<pre>
         
         Name of the file :<input type="text" name="fileName" />
         
         Content Type :<input type="text" name="contentType" />
         
         <input type="submit" value="Download" />
         
         </pre>

	</form>

</body>
</html>