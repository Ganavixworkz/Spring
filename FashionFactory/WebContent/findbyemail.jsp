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
<form action="email" method="get">
<input class="form-control me-2" type="search" placeholder="Email" aria-label="Search" name="email">
        <button  type="submit">Search</button>
        <h1 style="text-align:center;">Fashion-Factory</h1>
<table border="10" align="center">
<tr>
<th>id</th>
<th>userName</th>
<th>phoneNumber</th>
<th>email</th>
<th>address</th>
</tr> 

<c:forEach items="${em}" var="dto">

<tr>
 <td>${dto.id}</td> 
<td>${dto.userName}</td>
<td>${dto.phoneNumber}</td>
<td>${dto.email}</td>
<td>${dto.address}</td>
</tr>
</c:forEach>
</table>
</form>

</body>
</html>