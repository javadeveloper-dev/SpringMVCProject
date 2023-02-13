<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored ="false" %> 
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<div class="container mt-4">
		<form class="row g-3" action="handle-registration" method="post">
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Account Number</label> <input
					type="text" class="form-control" id="inputEmail4" name="accountNo" value="${accountNo}">
				<p class="text-danger">${accountNoMessege}</p>	
			</div>
			<div class="col-md-6">
				<label for="inputPassword4" class="form-label">IFSC Code
					</label> <input type="text" class="form-control" id="inputPassword4" name="ifscCodeNo" value="${ifscCode}">
				<p class="text-danger">${ifscCodeMessege}</p>
			</div>
			<div class="col-md-6">
				<label for="inputPassword4" class="form-label">User Id
					</label> <input type="text" class="form-control" id="inputPassword4" name="userId" value="${userId}">
				<p class="text-danger">${userIdMessege}</p>
			</div>
			<div class="col-md-6">
				<label for="inputPassword4" class="form-label">Password
					</label> <input type="text" class="form-control" id="inputPassword4" name="password" value="${password}">
					<p class="text-danger">${passwordMessege}</p>
				</div>
			<div class="col-md-6">
				<label for="inputPassword4" class="form-label">Mobile Number</label>
				<input type="text" class="form-control" id="inputPassword4" name="mobileNo" value="${mobileNo}">
				<p class="text-danger">${mobileNoMessege}</p>
			</div>
			<button type="submit" class="btn btn-success">Go</button>
		</form>
		<a href="${pageContext.request.contextPath }/">Back To Login Page</a>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</html>