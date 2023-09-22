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
 <div class="container w-50 border border-dark border-5 mt-5">
 <h3>Id : ${dto.id}</h3>
<h3>User Name : ${dto.userName}</h3>
<h3>Phone Number : ${dto.phoneNumber}</h3>
<h3>Email : ${dto.email}</h3>
<h3>Aadhar : ${dto.aadharNo}</h3>
<h3>Pan Number : ${dto.panNo}</h3>
<h3>Duration : ${dto.duration}</h3>
<h3>User DL : ${dto.userDl}</h3>
<h3>Amount : ${dto.amount}</h3>
<h3>Address : ${dto.address}</h3>
</body>
</html>