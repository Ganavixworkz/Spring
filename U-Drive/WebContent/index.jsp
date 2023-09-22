<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

</head>
<body>
<div class="container w-50 border border-dark border-5 mt-5">
<form action="save" method="post">
<div class= "mb-3">
<label class="form-label">Id</label> <input type="number" name="id" class="form-control">
</div>

<div class= "mb-3">
<label class="form-label">User Name</label> <input type="text" name="userName" class="form-control">
</div>

<div class= "mb-3">
<label class="form-label">Phone Number</label> <input type="number" name="phoneNumber" class="form-control">
</div>

<div class= "mb-3">
<label class="form-label">Mail</label> <input type="text" name="email" class="form-control">
</div>

<div class= "mb-3">
<label class="form-label">AadharNo</label> <input type="number" name="aadharNo" class="form-control">
</div>

<div class= "mb-3">
<label class="form-label">Pan No</label> <input type="text" name="panNo" class="form-control">
</div>

<div class= "mb-3">
<label class="form-label">Duration</label> <input type="number" name="duration" class="form-control">
</div>

<div class= "mb-3">
<label class="form-label">User DL</label> <input type="text" name="userDl" class="form-control">
</div>

<div class= "mb-3">
<label class="form-label">Amount</label> <input type="number" name="amount" class="form-control">
</div>

<div class= "mb-3">
<label class="form-label">Address</label> <input type="text" name="address" class="form-control">
</div>
<input type="submit">
</form>
</div>


</body>
</html>