<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
 crossorigin="anonymous">
</head>
<body>
<form action="update" method="post">
<div class= "mb-2">
<label class="form-label">Id</label> <input type="text" name="id" class="form-control" required="required"  readonly value="${dto.id}">
</div>
<div class= "mb-2">
<label class="form-label">User Name</label> <input type="text" name="userName" class="form-control" required="required" value="${dto.userName}">
</div>

<div class= "mb-3">
<label class="form-label">Phone Number</label> <input type="number" name="phoneNumber" class="form-control" required="required" value="${dto.phoneNumber}">
</div>

<div class= "mb-3">
<label class="form-label">Mail</label> <input type="email" name="email" class="form-control" required="required" value="${dto.email}">
</div>

<div class= "mb-3">
<label class="form-label">Address</label> <input type="text" name="address" class="form-control" required="required" value="${dto.address}">
</div>
<input type="submit" value="update" class="btn btn-success"> 
					<input type="reset" class="btn btn-secondary"> 
				
			</form>
</div>

</body>
</html>