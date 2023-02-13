<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<form action="${pageContext.request.contextPath }/transaction-handle">
		<div class="container  ">
			<div class="col-md-6">
				<input type="hidden" value="${transaction.getTransactionId()}"
					name="transactionId" /> <label for="inputEmail4"
					class="form-label">Account Number</label> <input type="number"
					class="form-control" id="inputEmail4" name="accountNo"
					value="${transaction.getAccountNo()}">
			</div>
			<div class="col-md-6">
				<label for="inputPassword4" class="form-label">Full Name </label> <input
					type="text" class="form-control" id="inputPassword4" maxlength="20"
					name="name" value="${transaction.getName()}">
			</div>
			<div class="col-md-6">
				<label for="inputPassword4" class="form-label">Email Id </label> <input
					type="email" class="form-control" id="inputPassword4"
					name="emailId" value="${transaction.getEmailId()}">
			</div>
			<div class="col-md-6">
				<label for="inputPassword4" class="form-label">Phone No </label> <input
					type="text" maxlength="10" required class="form-control" id="inputPassword4"
					name="phoneNo" value="${transaction.getPhoneNo()}">
			</div>
			<div class="form-group col-md-6">
				<label for="exampleFormControlSelect1">Transaction Type</label> <select
					class="form-control" id="exampleFormControlSelect1"
					name="transactionType">
					<option value="none" selected disabled hidden>-- Select --</option>
			<option value="Credit"
				${transaction.getTransactionType().contains("Credit")?"selected":""}>Credit</option>
			<option value="Debit"
				${transaction.getTransactionType().contains("Debit")?"selected":""}>Debit</option>
				</select>
				
			</div>

			<div class="col-md-6">
				<label for="inputPassword4" class="form-label">Amount</label> <input
					type="text" maxlength="9" required class="form-control" id="inputPassword4"
					name="amount" value="${transaction.getAmount()}">
			</div>
			<button type="submit" class="btn btn-success col-md-6 mt-4">Submit</button>
		</div>
	</form>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
</html>