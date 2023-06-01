<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	${fName}
	<h1>DETAILS OF PASSPORT</h1>
	<form action="click" method="post">
		<pre>
	First Name :<input type="text" name="fName" />
	Last Name :<input type="text" name="lName" />
	Email ID :<input type="text" name="email" />
	Contact Number :<input type="text" name="contactNo" />
	<input type="submit" value="Click" />
	</pre>
	</form>
</body>
</html>