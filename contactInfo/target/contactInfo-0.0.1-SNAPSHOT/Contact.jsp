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
	// 	var name3 = document.getElementById("name").value;
	// 	var email = document.getElementById("email").value;
	// 	var mobile = document.getElementById("mobile").value;
	// 	var comment = document.getElementById("comment").value;
	// 	var validName = true;
	// 	var validEmail = true;
	// 	var validMobile = true;
	// 	var validComment = true;

	// 	function validateName() {

	// 		if (name3 == "") {
	// 			document.getElementById("name2").innerHTML = "*Please enter the name";
	// 			validName = false;
	// 			return validName;
	// 		}
	// 		if (name3.length < 3) {
	// 			document.getElementById("name2").innerHTML = "*name should have atleast 3 letters";
	// 			validName = false;
	// 			return validName;
	// 		}
	// 		return validName;
	// 	}
	// 	function validateEmail() {

	// 		if (email == "" || email == null) {
	// 			doucument.getElementById("email2").innerHTML = "*Please enter ur email address";
	// 			validEmail = false;
	// 			return validEmail;
	// 		}
	// 		if (email.length < 10) {
	// 			document.getElementById("email2").innerHTML = "*Email id should have atleast 10 characters";
	// 			validEmail = false;
	// 			return validEmail;
	// 		}
	// 		return validEmail;
	// 	}
	// 	function validateMobile() {

	// 		if (mobile == "" || mobile == null) {
	// 			document.getElementById("mobile2").innerHTML = "*Mobile number should have 10 numbers"
	// 			validMobile = false;
	// 			return validMobile;
	// 		}
	// 		if (mobile.length < 10) {
	// 			document.getElementById("mobile2").innerHTML = "*Mobile number should have 10 numbers"
	// 			validMobile = false;
	// 			return validMobile;
	// 		}
	// 		return validMobile;
	// 	}

	// 	function validateComments() {

	// 		if (comment = "" || comment == null) {
	// 			document.getElementById("comment2").innerHTML = "*Please write the comment in Text area"
	// 			validComment = false;
	// 			return validComment;
	// 		}
	// 		return validComment;
	// 	}
	// 	function valid() {
	// 		if (validName, validEmail, validMobile, validComment) {
	// 			return true;
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

	<h1 style="color: maroon; text-align: center;">Fill Your Contact
		Information</h1>

	<form
		style="border: 1px; color: teal; margin-left: 120px; margin-right: 120px"
		action="send" method="post" onsubmit="return valid()">
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
	
	<input type="submit" value="Send" onclick="valid" />
	</pre>
	</form>

</body>
</html>