
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Air  India Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

</head>
<body style="background-image: url('https://wallpapers.com/images/hd/lighter-solid-grey-cement-color-kc6ss4hyhrogstkq.jpg');
background-repeat: no-repeat;
  background-size: 3500px 1150px;">



<nav class="navbar navbar-expand-lg bg-secondary">
 <img src="https://1000logos.net/wp-content/uploads/2020/09/Air-India-Logo.jpg" alt="Bootstrap" width="50" height="50">

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
       </form>
<div class="container w-50 border border-dark border-5 mt-5">

<form action="click" method="post">
		<div class="mb-3">
			<label class="form-label">User Name</label> <input type="text"
				class="form-control" placeholder="enter User Name"
				name="userName" required="required">
		</div>
		
		<div class="mb-3">
			<label class="form-label">Phone Number</label> <input type="text"
				class="form-control" placeholder="enter Phone Number"
				name="phoneNumber" required="required">
		</div>
		
		<div class="mb-3">
			<label class="form-label">e-mail</label> <input type="text"
				class="form-control" placeholder="enter e-mail"
				name="email" required="required">
		</div>
		
		<div class="mb-3">
			<label class="form-label">Passport Number</label> <input type="text"
				class="form-control" placeholder="enter Passport Number"
				name="passportNumber" required="required">
		</div>
		
		<div class="mb-3">
			<label class="form-label">Date Of Birth</label> <input type="text"
				class="form-control" placeholder="enter Date Of Birth"
				name="dateOfBirth" required="required">
		</div>
		
		<div class="mb-3">
			<label class="form-label">Gender</label> <input type="text"
				class="form-control" placeholder="enter Gender"
				name="gender" required="required">
		</div>
		
		<div class="mb-3">
			<label class="form-label">Country Code</label> <input type="text"
				class="form-control" placeholder="enter Country Code"
				name="countryCode" required="required">
		</div>
		
		<div class="mb-3">
			<label class="form-label">Nationality</label> <input type="text"
				class="form-control" placeholder="enter Nationality"
				name="nationality" required="required">
		</div>
		
		<div class="mb-3">
			<label class="form-label">Address</label> <input type="text"
				class="form-control" placeholder="enter Address"
				name="address" required="required">
		</div>
		
		<input type="submit" class="btn btn-success" />
		
	<input class="btn btn-primary" type="reset" value="Reset">
</form>
</div>

<%@include file="footer.jsp" %>

</body>
</html>