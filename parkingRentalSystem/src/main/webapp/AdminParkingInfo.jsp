<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parking info</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script>
	/* function validateTerm() {
		var locate = document.getElementById("location").value;
		var vType = document.getElementById("vehicleType").value;
		var vClassification = document.getElementById("vehicleClassification").value;
		var term = document.getElementById("term").value;

		const req = new XMLHttpRequest();

		req.open("POST", "http://localhost:8081/parkingRentalSystem/save"
				+ locate + "/" + vType + "/" + vClassification + "/" + term);
		req.send();

		req.onload = function() {
			document.getElementById("error").innerHTML = this.responseText();
		}
	} */

	function validateLocation() {
		var loc = document.getElementById("location").value;
		console.log(loc);

		if (loc == null) {
			docoument.getElementById("location2").innerHTML = "* Please select the location";
			return false;
		}
		if (loc != null) {
			document.getElementById("location2").innerHTML = "";
			return true;
		}
	}
</script>
</head>
<body>

	<nav class="navbar navbar-light" style="background-color: teal;">
		<img style="margin-left: 20px" height="50px"
			src="https://thumbs.dreamstime.com/b/flat-isolated-vector-eps-illustration-icon-minimal-design-long-shadow-parking-ticket-117821594.jpg">
		<div>

			<a style="margin-left: 790px" class="btn btn-warning"
				href="LoginSuccess.jsp" role="submit">Home</a>
		</div>
		<div style="color: orange; font-size: x-large; margin-right: 20px">
			User,${dto.name}</div>
	</nav>

	<h3 style="text-align: center; color: purple;">PLEASE ENTER THE
		BELOW INFORMATION</h3>

	<form
		style="border: solid black 1px; margin-left: 280px; background-color: silver; margin-right: 280px; margin-bottom: 80px"
		action="save" method="post">
		<pre>
		
Location :<select id="location" onchange="return validateLocation()"
				class="form-select" name="location">
		<option value="">Select</option>
		<option value="Rajajinagar">Rajajinagar</option>
		<option value="BTM">BTM</option>
		<option value="Vijaynagar">Vijaynagar</option>
		<option value="Basavangudi">Basavangudi</option>
		<option value="Kormangala">Kormangala</option>
		</select><span id="location2" style="color: red"></span>
		
Vehicle-Type :<select id="vehicleType" class="form-select"
				name="vehicleType">
		    <option>Select</option>
			<option value="twoWheeler-electrical">Two-wheeler(Electrical)</option>
			<option value="twoWheeler-fuel">Two-wheeler(Fuel)</option>
			<option value="fourWheeler-electrical">Four-wheeler(Electrical)</option>
			<option value="fourWheeler-fuel">Four-wheeler(Fuel)</option>
		</select>
		
Vehicle Classification :<select id="vehicleClassification"
				class="form-select" name="vehicleClassification">
		<option>Select</option>
		<option value="Bike">Bike</option>
		<option value="Scooty">Scooty</option>
		<option value="BMW">BMW</option>
		<option value="MarutiSuzuki">MarutiSuzuki</option>
		<option value="Ford">Ford</option>
		<option value="Eretica">Eretica</option>
		<option value="Skoda">Skoda</option>
		<option value="Audi">Audi</option>
		<option value="Creta">Creta</option>
		<option value="Toyota">Toyota</option>
		<option value="Hyundai">Hyundai</option>
		</select>
				
Term :<select id="term" class="form-select" name="term">
	        <option>Select</option>
			<option value="1day">1day</option>
			<option value="1week">1week</option>
			<option value="15days">15days</option>
			<option value="1month">1month</option>
			<option value="3months">3months</option>
			<option value="HalfYear">HalfYear</option>
			<option value="1year">1year</option>
			</select>
			<!-- <span id="error" style="color: red"></span> -->
	 		
<input class="form-control" type="number" name="price"
				placeholder="Price" />
	  		
<input class="form-control" type="number" name="discountInPercentage"
				placeholder="Discount" />
		
		<input class="btn-success" type="submit" value="Save" />
		</pre>
	</form>

	<div class="footer fixed-bottom">
		<nav class="navbar navbar-light" style="background-color: teal;">
			<h6 style="margin-left: 250px;">
				© 2023 Copyright Parking website <span style="color: white;">${dto.email}</span>
				Last login :${dto.loginTime}
			</h6>
		</nav>
	</div>
</body>
</html>