<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<body>
	<div class="container">
		<div class="row bg-primary">
			<h1 style="color: white">Welcome To Online Banking Application</h1>

			<nav class="navbar navbar-expand-lg bg-primary">
				<div class="container-fluid">

					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNav"
						aria-controls="navbarNav" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarNav">
						<ul class="navbar-nav">
							<li class="nav-item"><a class="nav-link text-white"
								href="Welcome">Home</a></li>
							<li class="nav-item"><a class="nav-link text-white"
								href="CreateAccount.html">Create a New Account</a></li>
							<li class="nav-item"><a class="nav-link text-white"
								href="TransactionSummary">Transaction Summary</a></li>
							<li class="nav-item"><a class="nav-link text-white"
								href="UserAccount.html">User Account</a></li>
							<li class="nav-item"><a class="nav-link text-white" href="#">Contact
									Us</a></li>
							<li><a href="logOut" class="nav-link text-white "
								id="log-out">Log Out</a></li>
						</ul>
					</div>

				</div>
			</nav>
		</div>
		<c:if test="${transactions.isEmpty()}">
		<h3>There is No Transaction</h3>
		</c:if>
		<c:if test="${!transactions.isEmpty()}">
		<a href="Transactions"><h3>View Transactions</h3></a>
		</c:if>
		<h2>
			<a href="TransactionForm">Start Transaction</a>
		</h2>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</html>