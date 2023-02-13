<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Welcome.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container">
        <div class="row bg-primary">
            <h1 style="color:white">Welcome To Online Banking Application</h1>
                
        <nav class="navbar navbar-expand-lg bg-primary">
            <div class="container-fluid">
             
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a class="nav-link text-white "  href="#">Home</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link text-white" href="CreateAccount.html">Create a New Account</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link text-white" href="TransactionSummary">Transaction Summary</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link text-white" href="UserAccount.html">User Account</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link text-white" href="#">Contact Us</a>
                  </li>
                  <li>
                  <a href="LogOut" class="nav-link text-white " id="log-out">Log Out</a>
                  </li>
                </ul> 
              </div>
            </div>
          </nav>
        </div>
    </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</html>