<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Sign Up</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script>
	function findPrice() {
		var location = document.getElementById("location").value;
		var vType = document.getElementById("vehicleType").value;
		var vClassification = document.getElementById("vehicleClassification").value;
		var term = document.getElementById("term").value;

		const httpRequest = new XMLHttpRequest();

		httpRequest.open("GET",
				"http://localhost:8081/parkingRentalSystem/find/" + location
						+ "/" + vType + "/" + vClassification + "/" + term);
		httpRequest.send();

		httpRequest.onload = function() {
			console.log(this.responseText);
			var obj = JSON.parse(this.responseText);
			document.getElementById("price").value = obj.price;
			document.getElementById("discountInPercentage").value = obj.discountInPercentage;
			console.log(obj.price);
			console.log(obj.discountInPercentage);
			console.log(obj.price
					- (obj.price * (obj.discountInPercentage / 100)));
			document.getElementById("totalAmount").value = obj.price
					- (obj.price * (obj.discountInPercentage / 100));

		}
	}

	function validateEmail() {
		var email = document.getElementById("email").value;

		const httpRequest = new XMLHttpRequest();

		httpRequest.open("GET",
				"http://localhost:8081/parkingRentalSystem/validateByEmail/"
						+ email);
		httpRequest.send();

		httpRequest.onload = function() {
			console.log(this.responseText);
			document.getElementById("email2").innerHTML = this.responseText;
		}

	}

	function terms_changed(check) {
		if (check.checked) {
			document.getElementById("submit_button").disabled = false;
		} else {
			document.getElementById("submit_button").disabled = true;
		}
	}
</script>
</head>
<body>
<div class="footer fixed-top">
	<nav class="navbar navbar-light" style="background-color: teal;">
		<img style="margin-left: 20px" height="50px"
			src="https://thumbs.dreamstime.com/b/flat-isolated-vector-eps-illustration-icon-minimal-design-long-shadow-parking-ticket-117821594.jpg"><a
			style="margin-right: 20px" class="btn btn-warning"
			href="User.jsp" role="button">Home</a>
	</nav>
</div>
	<pre>
	
	
	
	</pre>

	<form
		style="border: solid black 1px; margin-left: 280px; background-color: silver; margin-right: 280px; margin-bottom: 80px"
		action="saveUserInfo" method="post">

		<pre>
		
<input class="form-control" type="text" id="userName" name="userName"
				placeholder="UserName" />
	
<input class="form-control" type="text" id="email" name="email"
				onchange="return validateEmail()" placeholder="Email ID" /><span
				id="email2" style="color: red"></span>
	
<input class="form-control" type="text" id="mobileNo" name="mobileNo"
				placeholder="Mobile No" />
	
Location :<select id="location" class="form-select" name="location">
		<option value="">Select</option>
		<option value="Rajajinagar">Rajajinagar</option>
		<option value="BTM">BTM</option>
		<option value="Vijaynagar">Vijaynagar</option>
		<option value="Basavangudi">Basavangudi</option>
		<option value="Kormangala">Kormangala</option>
		</select>
		
Vehicle-Type :<select id="vehicleType" class="form-select"
				name="vehicleType">
		    <option value="">Select</option>
			<option value="twoWheeler-electrical">Two-wheeler(Electrical)</option>
			<option value="twoWheeler-fuel">Two-wheeler(Fuel)</option>
			<option value="fourWheeler-electrical">Four-wheeler(Electrical)</option>
			<option value="fourWheeler-fuel">Four-wheeler(Fuel)</option>
		</select>
		
Vehicle Classification :<select id="vehicleClassification"
				class="form-select" name="vehicleClassification">
		<option value="">Select</option>
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
				
Term :<select id="term" onchange="findPrice()" class="form-select"
				name="term">
	        <option value="">Select</option>
			<option value="1day">1day</option>
			<option value="1week">1week</option>
			<option value="15days">15days</option>
			<option value="1month">1month</option>
			<option value="3months">3months</option>
			<option value="HalfYear">HalfYear</option>
			<option value="1year">1year</option>
			</select>

<input class="form-control" type="number" id="price" name="price"
				placeholder="Price" />
				
<input class="form-control" type="text" id="discountInPercentage"
				name="discountInPercentage" placeholder="Discount(%)" />
				
<input class="form-control" type="text" id="totalAmount"
				name="totalAmount" placeholder="Total Amount" />

<input type="checkbox" id="terms_and_conditions" value="1"
				onclick="terms_changed(this)" /><label for="terms_and_conditions">I agree</label>
   
        <button class="btn-success" type="submit" id="submit_button"
				disabled>Save</button>
    
	</pre>
	</form>

	<div style="size: 1" class="footer fixed-bottom">
		<nav class="navbar navbar-light" style="background-color: teal;">
			<h6 style="margin-left: 450px;">
				© 2023 Copyright Parking website <span style="color: orange;"></span>
			</h6>
		</nav>
	</div>
</body>
</html>