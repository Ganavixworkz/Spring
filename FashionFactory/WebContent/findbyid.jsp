<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fashion</title>
</head>
<body>

</body>
</html><form action="findbyid" method="get">
<input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="id">
        <button  type="submit">Search</button>
        <h1 style="text-align:center;">U-Drive</h1>
<table border="10" align="center">
<tr>
<th>id</th>
<th>userName</th>
<th>phoneNumber</th>
<th>email</th>
<th>address</th>

<tr>
 <td>${dto.id}</td> 
<td>${dto.userName}</td>
<td>${dto.phoneNumber}</td>
<td>${dto.email}</td>
<td>${dto.address}</td>

		
</tr>

</table>
</form>

</body>
