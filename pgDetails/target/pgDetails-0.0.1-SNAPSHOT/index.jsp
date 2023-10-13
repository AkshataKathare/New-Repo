<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PG details</title>
</head>
<body>

	<h1>Details of PG</h1>

	<form action="save" method="post">
		<pre>
		
	    PG Name :<input type="text" name="pgName" />
	    
	    PG Owner :<input type="text" name="pgOwner" />
	    
	    Location :<input type="text" name="location" />
	    
	    PG rent :<input type="text" name="pgRent" />
	    
	    No of floors :<input type="text" name="noOfFloors" />
	    
	    <input type="submit" value="Save" />


        </pre>
	</form>
</body>
</html>