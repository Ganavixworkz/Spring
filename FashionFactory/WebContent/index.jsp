<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fashion-Factory</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
 crossorigin="anonymous">
</head>
<body style="background-image: url('https://i.pinimg.com/736x/e1/84/d4/e184d4f7eb73582904b70986425b7670.jpg');
background-repeat: no-repeat;
  background-size: 1500px 665px;">
  
 <form action="save" method="get"></form>
 
  <nav class="navbar navbar-expand-lg bg-secondary">
 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNNd0TNb0QXJH9d0XZ8Wrr4FXxOabEUOFt5A&usqp=CAU" alt="Bootstrap" width="50" height="50">
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
       
       <li class="nav-item">
          <a class="nav-link" href="findall.jsp">FindAll</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="findbyid.jsp">FindById</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="findbyemail.jsp">FindByEmail</a>
        </li>
       
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button  type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<br>
<marquee><h2>WELCOME TO FASHION-FACTORY!!!</h2></marquee>

  <div class="container text-center">
  <div class="row">
    <div class="col">
      
    </div>
  <div class="col">
     
  
    </div>
    <div class="col">
      
    </div>
  </div>
</div>

</body>
</html>
  
  
</body>
</html>