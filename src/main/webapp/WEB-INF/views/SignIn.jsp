<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
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
	<div class="container mt-4 col-5">
		<form class="row g-3" action="handle-signIn" method="post">
			<div class="col-6">
				<label for="inputEmail4" class="form-label">User Id</label> <input
					type="text" class="form-control" id="inputEmail4" name="userId" value="${userId}">
			<p class="text-danger small">${userIdMessege}</p>
			</div>
			<div class="col-6 pd-10">
				<label for="inputPassword4" class="form-label">Password  </label> <input
					type="text" class="form-control" id="inputPassword4" value="${password}"
					name="password">
					<p class="text-danger small">${passwordMessege}</p>
					
				<button type="submit" class="btn btn-success col-6 mt-4">Sign In</button>
			</div>
			<a href="${pageContext.request.contextPath }/">Back To Login Page</a>
		</form>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</html>