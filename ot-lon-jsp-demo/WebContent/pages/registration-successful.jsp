<%@ page import="com.ot.lon.models.Person" %>

<html>
	<head>
		<title>Registration Successful!</title>
		<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.1/build/pure-min.css" integrity="sha384-oAOxQR6DkCoMliIh8yFnu25d7Eq/PHS21PClpwjOTeU2jRSq11vu66rf90/cZr47" crossorigin="anonymous" />
	</head>
	<body>
		<%
			Person person = (Person) request.getAttribute("person");
		%>
	
		<div class="pure-g">
		    <div class="pure-u-1-3"></div>
		    <div class="pure-u-1-3"><h1>Registration Successful!</h1></div>
		    <div class="pure-u-1-3"></div>
		</div>
		
		<div class="pure-g">
		    <div class="pure-u-1-3"></div>
		    <div class="pure-u-1-3"><p>The following are the details of your registration.</p></div>
		    <div class="pure-u-1-3"></div>
		</div>

		<br />
		
		<div class="pure-g">
		    <div class="pure-u-1-3"></div>
		    
		    <div class="pure-u-1-3">
				<b>First Name:</b> <br /><br />
				<%= person.getFirstName() %><br />
				<br />	
				
				<b>Last Name:</b> <br /><br />
				<%= person.getLastName() %><br />
				<br />
				
				<b>Birthdate:</b> <br /><br />
				<%= person.getBirthDate() %><br />
				<br />
				
				<b>Age:</b> <br /><br />
				<%= person.getAge() %><br />
				<br />
				
				<b>Gender:</b> <br /><br />
				<%= person.getGender() %><br />
				<br />
				
				<b>Address Line 1:</b> <br /><br />
				<%= person.getAddressLine1() %><br />
				<br />
				
				<b>Address Line 2:</b> <br /><br />
				<%= person.getAddressLine2() %><br />
				<br />
				
				<b>City:</b> <br /><br />
				<%= person.getCity() %><br />
				<br />
				
				<b>Country:</b> <br /><br />
				<%= person.getCountry() %><br />
				<br />
				
				<b>Mobile Number:</b> <br /><br />
				<%= person.getMobileNumber() %><br />
				<br />
				
				<br />
				
				<a class="pure-button-primary pure-button" href="./pages/index.jsp">Register another person</a>
				
				<br />
				<br />
			</div>
		    
		    <div class="pure-u-1-3"></div>
		</div>
		
		
	
	</body>
</html>