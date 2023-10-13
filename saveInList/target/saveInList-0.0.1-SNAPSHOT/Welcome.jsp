<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<h1>CONTACT APP</h1>
	<form action="save" method="post">
		<pre>
	
	Name :<input type="text" name="fullName" />
	
	Email :<input type="text" name="email" />
	
	Country :<select name="country">
	<option value="India">INDIA</option>
	<option value="America">AMERICA</option>
	<option value="Singapore">SINGAPORE</option>
	<option value="Bangladesh">BANGLADESH</option>
	<option value="SriLanka">SRILANKA</option>
	</select>
	
	Mobile No :<input type="text" name="contactNo" />
	
	Type :<select name="type">
	<option value="Mother">Mother</option>
	<option value="Father">Father</option>
	<option value="Brother">Brother</option>
	<option value="Sister">Sister</option>
	<option value="Aunt">Aunt</option>
	</select>
	
	Description :
	<textarea rows="8" cols="140" name="description"></textarea>
	
	<input type="submit" value="Save" /> 
	
	</pre>
	</form>



</body>
</html>