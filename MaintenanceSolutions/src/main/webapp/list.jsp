<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>


</head>
<body>

	<div class="container">
		<h1 align="center">Complain List</h1>
		<hr>
		<div class="row">
			<!--  	<div class="col-sm-10">-->
			<!-- Table Start Here -->
			
			 <table border="1" cellpadding="5">
            <caption><h2>List of produt</h2></caption>
            <tr>
               <th>Product Id</th>
						<th>Product Name</th>
						<th>Price</th>
						<th>unit</th>
						<th>date</th>
						<th>Category</th>
						<th>Action</th>
            </tr>
  <c:forEach items="${products}" var="product">                <tr>
                   <td><c:out value="${product.productId}" /></td>
							<td><c:out value="${product.productName}" /></td>
							<td><c:out value="${product.price}" /></td>
							<td><c:out value="${product.unit}" /></td>
							<td><c:out value="${product.date}" /></td>
							<td><c:out value="${product.productCategory}" /></td>
                    	<td>
							<td class="text-center"><a class='btn btn-info btn-xs'
								href="ProductsController?action=edit&productId=<c:out value="${product.productId }"/>"><span
									class="glyphicon glyphicon-edit"></span> Edit</a> <a
								href="ProductsController?action=delete&productId=<c:out value="${product.productId }"/>"
								class="btn btn-danger btn-xs"><span
									class="glyphicon glyphicon-remove"></span> Del</a></td>                </tr>
            </c:forEach>
        </table>
			
			<table>
			<thead>
		
					</table>
						</table>
  
 
			


<table>
  <thead>
  
  
					<tr>
						<th>Product Id</th>
						<th>Product Name</th>
						<th>Price</th>
						<th>unit</th>
						<th>date</th>
						<th>Category</th>
						<th>Action</th>
					</tr>
					</thead>
  
  
  
  
  <c:forEach items="${products}" var="product">
						<tr>
							<td><c:out value="${product.productId}" /></td>
							<td><c:out value="${product.productName}" /></td>
							<td><c:out value="${product.price}" /></td>
							<td><c:out value="${product.unit}" /></td>
							<td><c:out value="${product.date}" /></td>
							<td><c:out value="${product.productCategory}" /></td>

							<td>
							<td class="text-center"><a class='btn btn-info btn-xs'
								href="ProductsController?action=edit&productId=<c:out value="${product.productId }"/>"><span
									class="glyphicon glyphicon-edit"></span> Edit</a> <a
								href="ProductsController?action=delete&productId=<c:out value="${product.productId }"/>"
								class="btn btn-danger btn-xs"><span
									class="glyphicon glyphicon-remove"></span> Del</a></td>


						</tr>
					</c:forEach>
  
 
			
			
			
			
			
			
			
			
			
			
			


</body>

</html>