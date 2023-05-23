<%@page import="javax.swing.Icon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Details</title>
</head>
<body style="background-color: yellow;">
	<h1 style="color: purple; text-align: center;">GENERAL DETAILS</h1>

	<form
		style="color: green; border: 2px solid black; font-size: large; background-color: white; margin: 50px;"
		method="post" action="dharwad">
		<pre>
		     1.City Name :<input type="text" name="cityName" />
			 
	             2.City code :<input type="text" name="cityCode" /> 
			 
		     3.Area :<input type="number" name="cityArea" />
			 
	             4.Special:<input type="text" name="special" /> 
			 
		     5.State :<input type="text" name="state" /> 
			 
		     6.Established :<input type="date" name="establishedOn">
			 
		     7.Region : <input type="text" name="region" />
		     
		     8.Country :<input type="text" name="country" />
		     
		     9.Founded By :<input type="text" name="found" />
		     
		     10.Government Type :<input type="text" name="govType" />
		     
		     11.Government body :<input type="text" name="govBody" />
		     
		     12.MP :<input type="text" name="mp" />
		     
		     13.MLA :<input type="text" name="mla" />
		     
		     14.Elevation :<input type="number" name="elevation" />
		     
		     15.Population Rank :<input type="number" name="populationRank" />
		     
		     16.Population Density in square kilometer :<input type="number"
				name="populDensity" /> 
				
		     17.Present Population :<input type="number" name="presPopulation" />
		     
		     18.Official Language :<input type="text" name="offLang" />
		     
		     19.Vehicle Registration :<input type="text" name="vehRegist" />
		     
		     20.Airport :<input type="text" name="airport" />
		     
		     21.Taluk name :<select name="taluk">
		     
		     <option value="Dharwad Urban">Dharwad Urban</option>
		     <option value="Hubballi Urban">Hubballi Urban</option>
		     <option value="Hubballi Rural">Hubballi Rural</option>
		     <option value="Kundgol">Kundgol</option>
		     <option value="Navalgund">Navalgund</option>
		     </select>
		     
		     22.One Neighbour City :<input type="text" name="neighbour" />
		     
		     23.Soil Type :<input type="text" name="soilType" />
		     
		     24.My Home number :<input type="number" name="homeNumber" />
		     
		     25.My Area :<input type="text" name="myArea" />
		     
		     26.Home Name :<input type="text" name="homeName" />
		     
		     27.My EmailID :<input type="email" name="myEmail" />
		     
		     28:Brother :<input type="text" name="brother" />
		     
		     29.Sister :<input type="text" name="sister" />
		     
		     30.Mother :<input type="text" name="mother" />
		     
		     31.Father :<input type="text" name="father" />
		     
		     32.Grand Mother :<input type="text" name="grandMother" />
		     
		     33.Grand Father :<input type="text" name="grandFather" />
		     
		     34.My Current Location :<input type="text" name="currentLocation" />
		     
		     35.Age :<input type="number" name="age" />
		     
		     36.University :<input type="text" name="university" />
		     
		     37.Degree College :<input type="text" name="college" />
		     
		     38.Degree College Code :<input type="number" name="collegeCode" />
		     
		     39.Degree :
				B.Sc<input type="radio" name="degree1" value="B.Sc" />
				B.Com<input type="radio" name="degree1" value="B.Com" />
			    B.E<input type="radio" name="degree1" value="B.E" />
			    B.A<input type="radio" name="degree1" value="B.A" /> 
		    
		     40.Degree Subjects: 
		        PCM<input type="radio" name="degSub" value="PCM" />
		        PMCs<input type="radio" name="degSub" value="PMCs" />
		        PMSt<input type="radio" name="degSub" value="PMSt" />
		        CBZ<input type="radio" name="degSub" value="CBZ" />
		        PMFs<input type="radio" name="degSub" value="PMFs" />
		        CBMicro<input type="radio" name="degSub" value="CBMicro" />
		        
		     41.Degree College Area :<input type="text" name="collegeArea" />
		    
		     42.Degree College Principal :<input type="text"
				name="collPrincipal" />
		    
		     43.D Physics HOD :<input type="text" name="phyHOD" />
		    
		     44.D Chemistry HOD :<input type="text" name="chemHOD" />
		    
		     45.D Mathematics HOD :<input type="text" name="MathHOD" />
		    
		     46.PU College :<select name="puColl">
		    <option value="JSS">JSS RS Hukkeri College</option>
		    <option value="Hanchimani">Hanchinmani College</option>
		    <option value="Prism">Prism PU College</option>
		    </select>
		    
		     47.PU Subjects :<select name="puSubjects">
		      <option type="checkbox" value="physics">Physics</option>
		      <option type="checkbox" value="chemistry">Chemistry</option>
		      <option type="checkbox" value="mathematics">Mathematics</option>
		      <option type="checkbox" value="biology">Biology</option>
		       </select>
		    
		     48.PU Principal :<input type="text" name="puPrincipal" />
		     
		     49.PU College Area :<input type="text" name="puCollArea" /> 
		    
		     50.PU Strength :<input type="number" name="strength" />
		     
		     51.No of buses in DWD:<input type="number" name="buses" />
		     
		     52.AC Bus :<input type="text" name="acBus" />
		     
		     53.Smart City :<input type="text" name="smart" />
		     
		     54.No Of Hotels :<input type="number" name="hotels" />
		     
		     55.Famous Hotel :<input type="text" name="famousHotel" />
		     
		     56.Old Bus Stand Area :<input type="text" name="oldBusStand" />
		     
		     57.New Bus Stand Area :<input type="text" name="newBusStand" />
		     
		     58.Pedha Shop :<input type="text" name="pedhaShop" />
		     
		     59.BRTS established On :<input type="date" name="brts" />
		     
		     60.No of Hindus :<input type="number" name="hindus" />
		     	     
		     61.No of Muslims :<input type="number" name="muslims" />
		     
		     62.No of Chritians :<input type="number" name="christians" />
		     
		     63.No of Sikhs :<input type="number" name="sikhs" />
		     
		     64.Password :<input type="password" name="password1" /> 
		    
		     65.Confirm Password :<input type="password" name="password2" /> 
		     
		     <input type="submit" value="Submitting to Server" />   
</pre>
	</form>
</body>
</html>