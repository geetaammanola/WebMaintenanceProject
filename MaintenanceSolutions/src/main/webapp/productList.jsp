<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Product</title>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script>
	function success() {
		alert("Data Is Submitted Successfully");
	}
</script>

</head>
<body>

	<%
		response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate"); // http 1.1  & +
		// response.setHeader("Pragma","no-cache");  // older http 1.0
		// response.setHeader("Expires","0");  //for proxy server (0 means time here minute or second)
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>

	<nav class="navbar navbar-dark bg-primary">
		<a class="navbar-brand"><strong
			style="font-size: 26px; color: #fff">Maintenance Solution </strong></a>
		<form class="form-inline" action="logout">
			<button class="btn btn-outline-warning my-2 my-sm-0" type="submit">Logout</button>
		</form>
	</nav>

	<%@ include file="subMenu.jsp"%>
	<div class="container">
		<h1 align="center">Add New Product</h1>
		<hr>
		<br>

		<div class="row">

			<div class="col-lg-12 ">
				<table border=1 cellspacing="0" width="100%">
					<thead align="center">
						<tr>
							<th>Product Id</th>
							<th>Product Name</th>
							<th>Price</th>
							<th>unit</th>
							<th>date</th>


							<th colspan=2>Action</th>
						</tr>
					</thead>
					<tbody align="center">
						<c:forEach items="${products}" var="product">
							<tr>
								<td><c:out value="${product.productId}" /></td>
								<td><c:out value="${product.productName}" /></td>
								<td><c:out value="${product.price}" /></td>
								<td><c:out value="${product.unit}" /></td>
								<td><c:out value="${product.date}" /></td>

								<td class="text-center"><a class='btn btn-info btn-xs'
									href="ProductsController?action=edit&productId=<c:out value="${product.productId }"/>"><span
										class="glyphicon glyphicon-edit"></span> Edit</a> <a
									href="ProductsController?action=delete&productId=<c:out value="${product.productId }"/>"
									class="btn btn-danger btn-xs"><span
										class="glyphicon glyphicon-remove"></span> Del</a></td>


							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>

</body>
</html>


