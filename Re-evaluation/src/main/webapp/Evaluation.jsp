<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KUD</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style type="text/css">
form {
	background-color: linen;
}
</style>
<script type="text/javascript">
	function validateName() {
		var name2 = document.getElementById("studentName").value;
		var college = document.getElementById("collegeName").value;
		var totalMarks = document.getElementById("marks").value;

		if (name2 == "") {
			alert("Please enter the Student Name");
			return false;
		}
		if (name2.length < 3) {
			alert("Student name must have atleast 3 characters");
			return false;
		}
		if (college == "") {
			alert("Please enter the college name");
			return false;
		}
		if (college.length < 4) {
			alert("College name must contain atleast 4 letters");
			return false;
		}
		if (totalMarks > 34) {
			alert("Only if the marks is less than 35 is valid for re-evaluation");
			return false;
		}
		return true;
	}
</script>
</head>

<body>
	<nav class="navbar navbar-light" style="background-color: maroon;">
		<div class="container-fluid">
			<img height="40px"
				src="https://preparmy.com/wp-content/uploads/2017/04/KUD-Logo.png">

		</div>

		<div>
			<a href="ImageDisplay.jsp">View Image</a>
		</div>
		<div>
			<a href="list">List All</a>
		</div>
	</nav>


	<h3 style="text-align: center; color: green;">Secondary
		Pre-University Re-Evaluation Application</h3>

	<!--<c:forEach items="${errors}" var="error">
		<span style="color: red">${error.defaultMessage}</span>
		<br>
	</c:forEach>-->
	<form
		style="border: solid thin; margin-left: 150px; margin-right: 150px"
		action="subm" method="post" onsubmit="return validateName()"
		enctype="multipart/form-data">

		<pre>
		
	    Student photo :<input type="file" name="file" />
		
	    Student Name :<input id="studentName" type="text"
				name="studentName" value="${dto.studentName}" />
			
	    Subject :<select name="subject">
			<option value="">Select</option>
			<option value="Physics">Phy</option>
			<option value="Chemistry">Chem</option>
			<option value="Mathematics">Math</option>
			<option value="Biology">Bio</option>
			<option value="Kannada">Kannada</option>
			<option value="English">English</option>
		</select>
		
	    College Name :<input id="collegeName" type="text"
				name="collegeName" value="${dto.collegeName}" />
		
	    Total marks obtained :<input id="marks" type="number" name="marks"
				value="${dto.marks}" />
		
		<input type="submit" value="Submit" onclick="validateName()" />
		</pre>
	</form>
</body>
</html>