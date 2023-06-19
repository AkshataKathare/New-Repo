<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script>
	var validName = true;
	var validEmail = true;
	var validMobile = true;

	function validateName() {
		var name = document.getElementById("name").value;
		if (name == "" || name == null) {
			document.getElementById("name2").innerHTML = "Please enter the name";
			return false;
		}
		if (name.length < 3) {
			document.getElementById("name2").innerHTML = "Name should have atleast 3 letters";
			return false;
		}
		if (name.length >= 3) {
			document.getElementById("name2").innerHTML = "";
			return validName;
		}
		return validName;
	}
	function validateEmail() {

		var email = document.getElementById("email").value;
		if (email == "" || email == null) {
			document.getElementById("email2").innerHTML = "Please enter the email";
			return false;
		}
		if (email.length < 10) {
			document.getElementById("email2").innerHTML = "email must have atleast 10 characters";
			return false;
		}
		if (email.length >= 10) {
			document.getElementById("email2").innerHTML = "";
			return validEmail;
		}
		return validEmail;
	}
	function validateMobile() {
		var mobile = document.getElementById("mobile").value;
		if (mobile.length<10||mobile.length>10) {
			document.getElementById("mobile2").innerHTML = "Mobile number should have 10 numbers";
			return false;
		}
		if (mobile.length = 10) {
			document.getElementById("mobile2").innerHTML = "";
			return validMobile;
		}
		return validMobile;
	}
	// 	function validateComments() {
	// 		var comment = document.getElementById("comments").value;

	// 		if (comment == "" || comment == null) {
	// 			document.getElementById("comment2").innerHTML = "Pass the comment";
	// 			return false;
	// 		}
	// 		if (comment.length > 3) {
	// 			document.getElementById("comment2").innerHTML = "";
	// 			return true;
	// 		}
	// 		return true;

	// 	}
	// 	function valid() {
	// 			if (name == "" || name == null) {
	// 				document.getElementById("name2").innerHTML = "Please enter the name";
	// 				return false;
	// 			}
	// 			if (name.length < 3) {
	// 				document.getElementById("name2").innerHTML = "Name should have atleast 3 letters";
	// 				return false;
	// 			}
	// 			if (validName, validEmail, validMobile) {
	// 				return true;
	// 			}
	// 		}
	// 		return false;
	// 	}
</script>
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: purple;">
		<div>
			<img height="40px"
				src="https://tse2.mm.bing.net/th?id=OIP.cJIVil0nuf3Jvn_DoDXivQHaG0&pid=Api&P=0&h=180">
		</div>
	</nav>

	<a href="Search.jsp">Search</a>

	<h1 style="color: teal; text-align: center;">Fill Your Contact
		Information</h1>

	<form
		style="border: 1px; color: teal; margin-left: 150px; margin-right: 150px"
		action="send" method="post" onsubmit="return valid()"
		enctype="multipart/form-data">
		<pre>
Name :<input type="text" name="name" id="name" class="form-control"
				rows="3" value="${dto.name}" onchange="return validateName()" /><span
				id="name2" style="color: red"></span>
	
Email :<input type="text" name="email" value="${dto.email}"
				class="form-control" rows="3" id="email"
				onchange="return validateEmail()" /><span id="email2"
				style="color: red"></span>
	
Mobile :<input type="text" name="mobile" class="form-control" rows="3"
				value="${dto.mobile}" id="mobile" onchange="return validateMobile()" /><span
				id="mobile2" style="color: red"></span>
	
Comments :<textarea rows="5" cols="40" class="form-control" rows="3"
				name="comments" id="comment" onchange="return validateComments()"></textarea>
		<span id="comment2" style="color: red"></span>
	
File :<input type="file" name="file" />
	
	<input class="btn btn-success" type="submit" value="Send"
				onclick="valid" />
	</pre>
	</form>

</body>
</html>