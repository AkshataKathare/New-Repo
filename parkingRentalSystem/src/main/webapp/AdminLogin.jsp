<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script>
	function validEmail() {
		var email = document.getElementById("email").value;

		if (email.length < 10) {
			document.getElementById("email2").innerHTML = "*Email should have atleast 10 characters";
			return false;
		}
		if (email.length >= 10) {
			document.getElementById("email2").innerHTML = "";
			return true;
		}
		return true;
	}
	function validPassword() {

		var password = document.getElementById("password").value;

		if (password.length < 8) {
			document.getElementById("password2").innerHTML = "*Password should have atleast 8 characters";
			return false;
		}
		if (password.length >= 8) {
			document.getElementById("password2").innerHTML = "";
			return true;
		}
		return true;
	}
</script>
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: teal;">
		<img style="margin-left: 20px" height="50px"
			src="https://thumbs.dreamstime.com/b/flat-isolated-vector-eps-illustration-icon-minimal-design-long-shadow-parking-ticket-117821594.jpg">
		<div>
			<a style="font-size: x-large; margin-right: 30px"
				class="btn btn-warning" href="ParkingHome.jsp" role="button">Home</a>
		</div>

	</nav>
	<h1 style="text-align: center; color: teal;">Admin Login Page</h1>

	<form
		style="border: solid black 1px; margin-left: 280px; background-color: silver; margin-right: 280px"
		action="login" method="post">

		<pre>
		
 Email-ID <span style="color: red">*</span> :<input class="form-control"
				type="text" name="email" id="email" required="required"
				onchange="return validEmail()" /><span style="color: red"
				id="email2"></span>
	    
 Password <span style="color: red">*</span> :<input class="form-control"
				type="password" name="password" id="password"
				onchange="return validPassword()" /><span style="color: red"
				id="password2"></span>
	    <span style="color: red">${incorrectEmailOrPassword}</span>
	    <input class="btn-success" style="margin-left: 150px" type="submit"
				value="Login" />
	</pre>
	</form>
	<footer style="margin-top: 50px">
		<nav class="navbar navbar-light" style="background-color: teal;">
			<pre>
		</pre>
		</nav>
	</footer>
</body>
</html>