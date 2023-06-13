<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driving License</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script>
	function validationForm() {
		var name = document.getElementById("name").value;
		var age = document.getElementById("age").value;
		var city = document.getElementById("city").value;
		var state = document.getElementById("state").value;
		var country = document.getElementById("country").value;

		if (name == "") {
			// 			alert("Enter the Name");
			document.getElementById("name2").innerHTML = "* Enter the Name";
			return false;
		}
		if (name.length < 3) {
			// 			alert("Name must be at least 3 char");
			document.getElementById("name2").innerHTML = "* Name should have at least 3 letters";
			return false;
		}
		if (age < 18) {
			// 			alert("Age must be greater than 18");
			document.getElementById("age2").innerHTML = "* Age must be greater than 18";
			return false;
		}
		if (city == "") {
			// 			alert("Please enter the city name");
			document.getElementById("city2").innerHTML = "* Please enter the city name";
			return false;
		}
		if (city.length < 3) {
			// 			alert("City must be at least 3 char");
			document.getElementById("city2").innerHTML = "* City must have at least 3 letters";
			return false;
		}

		if (state == "") {
			// 			alert("Please enter the state name");
			document.getElementById("state2").innerHTML = "* Please enter the state name";
			return false;
		}
		if (state.length < 3) {
			// 			alert("State name must be at least 3 char");
			document.getElementById("state2").innerHTML = "* State must have at least 3 letters";
			return false;
		}
		if (country == "") {
			// 			alert("Please enter the country name");
			document.getElementById("country2").innerHTML = "* Please enter the country name";
			return false;
		}
		if (country.length < 3) {
			// 			alert("Coutry name must be at least 3 char");
			document.getElementById("country2").innerHTML = "* Coutry name must be at least 3 char";
			return false;
		}
		return true;
	}
</script>
</head>
<body>

	<nav class="navbar navbar-light" style="background-color: teal;">
		<div>
			<img height="50px"
				src="https://tse1.mm.bing.net/th?id=OIP.29m-3-T3tLDplFTJWbl8NgAAAA&pid=Api&P=0&h=180">
			<a style="color: yellow; margin-left: 40px;" href="DownloadFile.jsp">File
				download</a> <a style="color: yellow; margin-left: 40px;"
				href="showInList">Table Format</a>
		</div>
	</nav>

	<h1 style="color: maroon;">Driving License Application Form</h1>
	<!--<c:forEach items="${errors}" var="error">
		<span style="color: red">${error.defaultMessage}</span>
	</c:forEach>-->



	<form action="save" method="post" enctype="multipart/form-data"
		onsubmit="return validationForm()"
		style="border: solid 2px; margin-left: 150px; margin-right: 150px">
		<pre>
	        Name :<span style="color: red">*</span><input type="text"
				name="fullName" class="col-form-label" value="${dto.fullName}"
				id="name" onchange="return validationForm()" /><span id="name2" style="color: red"></span>
	        
	        Age :<span style="color: red">*</span><input type="number"
				name="age" value="${dto.age}" id="age" /><span id="age2"
				style="color: red"></span>
	        
	        City :<span style="color: red">*</span><input type="text"
				name="city" value="${dto.city}" id="city" /><span id="city2"
				style="color: red"></span>
	        
	        State :<span style="color: red">*</span><input type="text"
				name="state" value="${dto.state}" id="state" /><span id="state2"
				style="color: red"></span>
	        
	        Country :<input type="text" name="country"
				value="${dto.country}" id="country" /><span id="country2"
				style="color: red"></span>
	        
	        ID Proof<span style="font-size: x-small;">(Aadhar Card/PAN Card)</span> :<span
				style="color: red">*</span><input type="file" name="file" />
	        
	        <input type="submit" name="Submit" onclick="validationForm()" />
	</pre>
	</form>
</body>
</html>