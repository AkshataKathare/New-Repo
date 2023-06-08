<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Download page</title>
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
			<a href="Job.jsp" style="color: black; font-size: xlarge;">Home</a>

		</div>
	</nav>
	<form action="download" method="get">
		<br>


		<pre
			style="border: solid 2px; margin-left: 200px; margin-right: 200px">

         File Name :-<input type="text" name="fileName"
				placeholder="nature.jpg" />
         
         Content-Type :-<input type="text" name="contentType"
				placeholder="image/jpeg" />
         
         <input style="margin-left: 150px"
				class="btn btn-outline-success" type="submit" value="Download File">
         
</pre>
	</form>


</body>
</html>