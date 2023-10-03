<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body>
<div class="container w-50 border border-dark border-5 mt-5" >

<h3>User Name:${AD.userName}</h3>
<h3>Phone Number:${AD.phoneNumber}</h3>
<h3>E-mail:${AD.email}</h3>
<h3>Passport Number:${AD.passportNumber}</h3>
<h3>Date Of Birth:${AD.dateOfBirth}</h3>
<h3>Gender:${AD.gender}</h3>
<h3>Country Code:${AD.countryCode}</h3>
<h3>Nationality:${AD.nationality}</h3>
<h3>Address:${AD.address}</h3>
</body>
</html>
