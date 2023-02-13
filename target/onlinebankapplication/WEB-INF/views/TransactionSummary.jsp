<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
							<li class="nav-item"><a class="nav-link text-white" href="#">Home</a>
							</li>
							<li class="nav-item"><a class="nav-link text-white"
								href="CreateAccount.html">Create a New Account</a></li>
							<li class="nav-item"><a class="nav-link text-white"
								href="TransactionList.html">Transaction Summary</a></li>
							<li class="nav-item"><a class="nav-link text-white"
								href="UserAccount.html">User Account</a></li>
							<li class="nav-item"><a class="nav-link text-white" href="#">Contact
									Us</a></li>
						</ul>
					</div>
					<a href="#" class=".text-white">Log Out</a>
				</div>
			</nav>
		</div>
		<h3>There is No Transaction</h3>
		<!-- Else Display This Messege -->
		<a href="Transactions"><h3>View Transactions</h3></a>
		<h2><a href="TransactionForm">Start Transaction</a></h2>
		
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</html>