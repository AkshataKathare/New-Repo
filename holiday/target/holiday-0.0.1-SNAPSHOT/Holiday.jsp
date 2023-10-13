<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Holiday</title>
</head>
<body>
	<h1>Holiday details</h1>
	<form action="save" method="post">
		<pre>
  ID :<input type="number" name="id" />

  Holiday Start month :<input type="text" name="startMonth" />

  Holiday End month : <input type="text" name="endMonth" />

  Visited Place :<input type="text" name="visitedPlace" />

<input type="submit" value="Save" />
</pre>
	</form>

</body>
</html>