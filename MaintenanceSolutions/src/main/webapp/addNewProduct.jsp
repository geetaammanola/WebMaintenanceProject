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


				<form id="addProduct" method="post" action="ProductsController"
					role="form">

					<div class="messages"></div>

					<div class="controls">

						<div class="row">
						
						<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Product Id </label> <input id="form_name"
										type="text" name="productId"
										 value="<c:out value="${product.productId}" />"
										  class="form-control"
										placeholder="Please enter Price " readonly="readonly" required="required"
										data-error="Price is required.">

									<div class="help-block with-errors"></div>

								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Product Name </label> <input
										id="form_name" type="text" name="productName"
										 value="<c:out value="${product.productName}" />"
										class="form-control" placeholder="Please enter Product Name "
										required="required" data-error="productname is required.">

									<div class="help-block with-errors"></div>

								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Price </label> <input id="form_name"
										type="text" name="price"
										 value="<c:out value="${product.price}" />"
										  class="form-control"
										placeholder="Please enter Price " required="required"
										data-error="Price is required.">

									<div class="help-block with-errors"></div>

								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="form_name">Unit </label> <input id="form_name"
										type="text" name="unit"
										 value="<c:out value="${product.unit}" />"
										  class="form-control"
										placeholder="Please enter Unit" required="required"
										data-error="Unit is required.">

									<div class="help-block with-errors"></div>

								</div>
							</div>



							<div class="col-md-6">
								<div class="form-group">
									<label for="date">Date </label> <input id="form_lastname"
										type="text" name="date" 
										 value="<c:out value="${product.date}" />"
										 class="form-control"
										placeholder="YYYY/DD/MM" required="required"
										data-error="date is required.">
									<div class="help-block with-errors"></div>
								</div>
							</div>
						</div>


						<div class="row">

							<div class="col-md-12">
								<div class="pull-right">
									<input type="submit" class="btn btn-primary"
										onclick="success()" value="Submit">
								</div>
							</div>

						</div>
				</form>

			</div>

		</div>

	</div>

</body>
<script
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js'></script>
<script
	src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>
<script
	src='https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js'></script>

</html>