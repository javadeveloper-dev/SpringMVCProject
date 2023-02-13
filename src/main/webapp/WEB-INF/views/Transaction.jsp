<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" ></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
</head>
<body>
    <h3 style="text-align:center;">All Transactions </h3>
    <div class="container mt-4">

        <table class="table">
            <thead>
              <tr>
                <th scope="col">Transaction ID</th>
                <th scope="col">Account Number</th>
                <th scope="col">Name</th>
                <th scope="col">Phone No.</th>
                <th scope="col">Transaction Type</th>
                <th scope="col">Amount</th>
                <th scope="col">Action</th>
              </tr>
            </thead>
            <tbody>
        <c:forEach items="${transactions}" var="t">
              <tr>
                <th scope="row">${t.getTransactionId()}</th>
                <td>${t.getAccountNo()}</td>
                <td>${t.getName()}</td>
                <td>${t.getPhoneNo()}</td>
                <td>${t.getTransactionType()}</td>
                <td>${t.getAmount()} Rs</td>
                <td><a href="delete/${t.getTransactionId()}">Delete
                <a href="update/${t.getTransactionId()}">Edit</a></td>  <!-- When we click on edit then redirects to TransactionList-->
              </tr>
          </c:forEach>
            </tbody>
          </table>
          <a href="TransactionSummary"><p style="text-align:center">Back</p></a>
    </div>

</body>
</html>