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
<h1>User Name:${d.userName}</h1>
<h1>Phone Number:${d.phoneNumber}</h1>
<h1>Email:${d.email}</h1>
<h1>Address:${d.address}</h1>


</body>
</html>