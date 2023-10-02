<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

</head>
<body>
<form action="save" method="post">
<nav class="navbar navbar-expand-lg bg-secondary">
 <img src="https://media.istockphoto.com/id/868439208/vector/car-repair-or-delivery-service-label.jpg?s=612x612&w=0&k=20&c=BDeZPNT6RcqcLWPpn5sbNytBn3_X5oexXo7mxcU8hu4=" alt="Bootstrap" width="50" height="50">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="register.jsp">Registration</a>
        </li>
        </ul>
        </div>
        </div>
        </nav>
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