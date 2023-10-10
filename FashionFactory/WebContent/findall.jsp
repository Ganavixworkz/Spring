<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fashion</title>
</head>
<body>
<form action="findAll" method="get">
	<h1 style="text-align: center;">Fashion-Factory</h1>
		<table border="10" align="center">
			<tr>
                <th>id</th>
				<th>userName</th>
				<th>phoneNumber</th>
				<th>email</th>
				<th>address</th>
				<th>Action</th>
			</tr>

			<c:forEach items="${dtos}" var="dto">

				<tr>
					 <td>${dto.id}</td> 
					<td>${dto.userName}</td>
					<td>${dto.phoneNumber}</td>
					<td>${dto.email}</td>
					<td>${dto.address}</td>
					
					<td><a href="update?id=${dto.id}" class="btn btn-sm btn-primary">Update</a> 
<a href="delete/${dto.id}" class="btn btn-sm btn-danger m-1">Delete</a></td>
</tr>
				
			</c:forEach>
		</table>
		
	<input type="submit" text-align="center">
	</form>
	
	<div>
	</div>
</body>
<div>
	<h2>${success}</h2>
	<h2>${fail}</h2>
	</div>
</html>